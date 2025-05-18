package com.order_something.holy_grail.controller;

import com.order_something.holy_grail.entity.FoodItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/food")
public class FoodController {

    @GetMapping("/item")
    public FoodItem getItem() {
        FoodItem mcSpicy = new FoodItem(
                1L,
                "McSpicy® x Frank's RedHot®",
                new BigDecimal("6.59"),
                507,
                "Hot and spicy 100% chicken breast in a crispy coating, served with lettuce, cheese made with Emmental, jalapenos, onions and a Frank’s RedHot® Mayo in a sesame seed bun. Allergen information available at www.mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );
        return mcSpicy;
    }

}
