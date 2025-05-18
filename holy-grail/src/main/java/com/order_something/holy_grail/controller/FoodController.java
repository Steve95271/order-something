package com.order_something.holy_grail.controller;

import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.FoodItemMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@RequestMapping("/food")
public class FoodController {

    @GetMapping("/menu")
    public FoodItemMenu foodMenu() {
        FoodItemMenu menu = new FoodItemMenu("Featured");
        FoodItem foodItem1 = new FoodItem("McSpicy® x Frank's RedHot®", "Hot and spicy 100% chicken breast in a crispy coating, served with lettuce, cheese made with Emmental, jalapenos, onions and a Frank’s RedHot® Mayo in a sesame seed bun. Allergen information available at www.mcdonalds.co.uk/nutrition", new BigDecimal("6.59"));
        FoodItem foodItem2 = new FoodItem("Steakhouse Stack", "Two 100% British and Irish beef patties, a slice of cheddar cheese, crispy onions, red onions and lettuce served with a black peppercorn sauce, all in a freshly toasted glazed sesame topped bun. Allergen info: www.mcdonalds.co.uk/nutrition", new BigDecimal("6.49"));
        FoodItem foodItem3 = new FoodItem("test", "test123", new BigDecimal("44.76"));

        menu.addFoodItem(foodItem1);
        menu.addFoodItem(foodItem2);
        menu.addFoodItem(foodItem3);

        return menu;
    }
}
