package com.order_something.holy_grail.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class FoodItem {
    private String name;
    private String description;
    private BigDecimal price;
}
