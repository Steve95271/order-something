package com.order_something.holy_grail.service;

import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.Menu;

import java.util.List;

public interface FoodService {

    /**
     * A complete food menu. a menu contains food categories and food items.
     * @return Returns a restaurant menu. Includes all categories and nested food items.
     */
    Menu getMenu();

}
