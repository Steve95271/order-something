package com.order_something.holy_grail.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Category {
    private Long id;
    private String title;
    private List<FoodItem> foodItemList;

    public void setItems(List<FoodItem> items) {
        this.foodItemList = items;
    }
}
