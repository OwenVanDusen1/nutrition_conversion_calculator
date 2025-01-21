package com.nutrition_conversion_calculator.nutrition_conversion_calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NutritionConversionCalculatorController {

    @Autowired
    FoodRepository foodRepository;

}
