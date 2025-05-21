package com.order_something.holy_grail.repository;

import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class FoodRepository {
    private final JdbcTemplate jdbcTemplate;

    public Menu getMenu() {

        String sqlCategories = """
                SELECT category_id, category
                FROM category
                """;

        String sqlItemsByCategory = """
                SELECT f.food_id, f.name, f.price, f.calorie, f.description, f.pictureUrl
                FROM food_category fc
                JOIN food f ON fc.food_id = f.food_id
                WHERE fc.category_id = ?
                """;

        List<Category> categories = jdbcTemplate.query(
                sqlCategories,
                (rs, rowNum) -> new Category(
                        rs.getLong("category_id"),
                        rs.getString("category"),
                        new ArrayList<FoodItem>()
                )
        );

        for (Category category : categories) {
            List<FoodItem> items = jdbcTemplate.query(sqlItemsByCategory,
                    (rs, rowNum) -> new FoodItem(
                            rs.getLong("food_id"),
                            rs.getString("name"),
                            rs.getBigDecimal("price"),
                            rs.getInt("calorie"),
                            rs.getString("description"),
                            rs.getString("pictureUrl")
                    ), category.getId()
            );
            category.setItems(items);
        }

        return new Menu(categories);

    }
}
