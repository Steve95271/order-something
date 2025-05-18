package com.order_something.holy_grail.entity;

import lombok.Getter;

import java.util.ArrayList;

public class FoodItemMenu {

    @Getter
    private String title;
    @Getter
    private final ArrayList<FoodItem> foodItems;

    public FoodItemMenu(String title) {
        this.title = title;
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        this.foodItems.add(foodItem);
    }

    public void removeFoodItem(FoodItem foodItem) {
        this.foodItems.remove(foodItem);
    }

    public FoodItem getFoodItem(int index) {
        return this.foodItems.get(index);
    }

}
