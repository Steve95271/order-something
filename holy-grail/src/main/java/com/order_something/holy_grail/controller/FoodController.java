package com.order_something.holy_grail.controller;

import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.entity.Menu;
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

    private final FoodService foodService;

    @GetMapping("/menu")
    public Menu getMenu() {
        return foodService.getMenu();
    }
}
