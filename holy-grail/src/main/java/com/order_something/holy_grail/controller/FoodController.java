package com.order_something.holy_grail.controller;

import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.FoodItemMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodItemMenu menu = new FoodItemMenu(1L, "Featured", new ArrayList<>());

    public FoodController() {
        FoodItem foodItem1 = new FoodItem(
                1L,
                "McSpicy® x Frank's RedHot®",
                new BigDecimal("6.59"),
                507,
                "Hot and spicy 100% chicken breast in a crispy coating, served with lettuce, cheese made with Emmental, jalapenos, onions and a Frank’s RedHot® Mayo in a sesame seed bun. Allergen information available at www.mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );

        FoodItem foodItem2 = new FoodItem(
                2L,
                "Steakhouse Stack",
                new BigDecimal("6.49"),
                667,
                "Two 100% British and Irish beef patties, a slice of cheddar cheese, crispy onions, red onions and lettuce served with a black peppercorn sauce, all in a freshly toasted glazed sesame topped bun. Allergen info: www.mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );

        FoodItem foodItem3 = new FoodItem(
                3L,
                "Cheesy Garlic Bread Dippers Sharebox®",
                new BigDecimal("6.99"),
                641,
                "A portion of twelve dippers of mozzarella cheese flavoured with garlic and chives, in a ciabatta-style breadcrumb coating, served with rich tomato dip. Serves 3. Allergen information available at www.mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );

        FoodItem foodItem4 = new FoodItem(
                4L,
                "The Deluxe Duo Deal (for Two)",
                new BigDecimal("11.99"),
                2160,
                "Choose two burgers with two medium fries. Product customisation may not be possible on this deal. Allergen information available at mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );

        FoodItem foodItem5 = new FoodItem(
                5L,
                "Feed the Family Deal (for Four)",
                new BigDecimal("14.99"),
                3008,
                "Choose two core burgers & two small burgers with two medium fries & two small fries. Product customisation may not be possible on this deal. Allergen information available at mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );

        FoodItem foodItem6 = new FoodItem(
                6L,
                "The McDonald's Chicken Sharebox®",
                new BigDecimal("10.99"),
                1240,
                "6x Chicken Selects® with 12x Chicken McNuggets®, 2x McNuggets® Dips and 2x Selects Dips. Serves 4 people (per serving 1297KJ/310kcal) . Allergen info: www.mcdonalds.co.uk/nutrition",
                "https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif"
        );



        menu.addFoodItem(foodItem1);
        menu.addFoodItem(foodItem2);
        menu.addFoodItem(foodItem3);
        menu.addFoodItem(foodItem4);
        menu.addFoodItem(foodItem5);
        menu.addFoodItem(foodItem6);
    }

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

    @GetMapping("/item/{id}")
    public FoodItem getItemMenu(@PathVariable Long id) {
        return new FoodItem(
                menu.getFoodItemById(id).getId(),
                menu.getFoodItemById(id).getName(),
                menu.getFoodItemById(id).getPrice(),
                menu.getFoodItemById(id).getCalorie(),
                menu.getFoodItemById(id).getDescription(),
                menu.getFoodItemById(id).getPictureUrl()
        );
    }

    @GetMapping("/menu")
    public FoodItemMenu foodItemMenu() {
        return menu;
    }
}
