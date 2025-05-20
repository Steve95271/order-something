package com.order_something.holy_grail.service;

import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.entity.FoodItem;

import java.util.List;

public interface FoodService {
    /**
     * Return all the categories of the restaurant
     * @return A list of categories
     */
    List<Category> categories();

    /**
     * Return the foods of the specific category by id
     * @param categoryId the id of the food category
     * @return Return the foods related to the specific category
     */
    List<FoodItem> getFoodItemsByCategoryId(Long categoryId);
}
