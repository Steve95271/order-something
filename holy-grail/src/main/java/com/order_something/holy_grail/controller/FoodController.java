package com.order_something.holy_grail.controller;

import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/food")
@RequiredArgsConstructor
public class FoodController {

    private final ArrayList<Category> menus = new ArrayList<>();
    private final FoodService foodService;

    /*public FoodController() {

        FoodItemMenu featuredMenu = new FoodItemMenu(1L, "Featured", new ArrayList<>());
        FoodItemMenu whatsNewMenu = new FoodItemMenu(2L, "WhatsNew", new ArrayList<>());





        featuredMenu.addFoodItem(foodItem1);
        featuredMenu.addFoodItem(foodItem2);
        featuredMenu.addFoodItem(foodItem3);
        featuredMenu.addFoodItem(foodItem4);
        featuredMenu.addFoodItem(foodItem5);
        featuredMenu.addFoodItem(foodItem6);
        whatsNewMenu.addFoodItem(foodItem1);
        whatsNewMenu.addFoodItem(foodItem3);
        whatsNewMenu.addFoodItem(foodItem5);
        whatsNewMenu.addFoodItem(foodItem2);
        whatsNewMenu.addFoodItem(foodItem4);

        menus.add(featuredMenu);
        menus.add(whatsNewMenu);
    }*/

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

//    @GetMapping("/item/{id}")
//    public FoodItem getItemMenu(@PathVariable Long id) {
//        return new FoodItem(
//                menus.getFirst().getFoodItemById(id).getId(),
//                menus.getFirst().getFoodItemById(id).getName(),
//                menus.getFirst().getFoodItemById(id).getPrice(),
//                menus.getFirst().getFoodItemById(id).getCalorie(),
//                menus.getFirst().getFoodItemById(id).getDescription(),
//                menus.getFirst().getFoodItemById(id).getPictureUrl()
//        );
//    }

    @GetMapping("/menu")
    public Category foodItemMenu() {
        return menus.get(1);
    }

    @GetMapping("/categories")
    public List<Category> foodItemMenuMenu() {
        return foodService.categories();
    }

    @GetMapping("/{categoryId}")
    public List<FoodItem> getFoodItemsByCategory(@PathVariable Long categoryId) {
        return foodService.getFoodItemsByCategoryId(categoryId);
    }
}
