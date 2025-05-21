package com.order_something.holy_grail.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Menu {
    private List<Category> categories;
}
