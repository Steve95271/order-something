package com.order_something.holy_grail.repository;

import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.entity.FoodItem;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class FoodRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<FoodItem> getFoodByCategory(Long categoryId) {
        String sql = """
                SELECT food.food_id, food.name, food.price, food.calorie, food.description, food.pictureUrl
                FROM food_category, food
                WHERE food_category.category_id = ?
                AND food_category.food_id = food.food_id;
                """;
        return jdbcTemplate.query(sql, new RowMapper<FoodItem>() {
            @Override
            public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new FoodItem(
                        rs.getLong("food.food_id"),
                        rs.getString("food.name"),
                        rs.getBigDecimal("food.price"),
                        rs.getInt("food.calorie"),
                        rs.getString("food.description"),
                        rs.getString("food.pictureUrl"));
            }
        }, categoryId);
    }

    public List<Category> getFoodCategories() {
        String sql = """
                SELECT * FROM category;
                """;
        return jdbcTemplate.query(sql, new RowMapper<Category>() {
            @Override
            public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Category(
                        rs.getLong("category_id"),
                        rs.getString("category"));
            }
        });
    }
}
