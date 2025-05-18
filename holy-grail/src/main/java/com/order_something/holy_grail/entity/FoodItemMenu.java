package com.order_something.holy_grail.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class FoodItemMenu {


    private Long Id;
    private String title;
    private final ArrayList<FoodItem> foodItems;

    public void addFoodItem(FoodItem foodItem) {
        this.foodItems.add(foodItem);
    }

}
