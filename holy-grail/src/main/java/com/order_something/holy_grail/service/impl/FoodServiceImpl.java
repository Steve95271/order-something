package com.order_something.holy_grail.service.impl;

import com.order_something.holy_grail.entity.Category;
import com.order_something.holy_grail.entity.FoodItem;
import com.order_something.holy_grail.entity.Menu;
import com.order_something.holy_grail.repository.FoodRepository;
import com.order_something.holy_grail.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    @Override
    public Menu getMenu() {
        return foodRepository.getMenu();
    }
}
