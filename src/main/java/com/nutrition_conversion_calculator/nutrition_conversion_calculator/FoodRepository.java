package com.nutrition_conversion_calculator.nutrition_conversion_calculator;

import org.springframework.data.repository.CrudRepository;

/**
 * CRUD operations to access repository of food items.
 */
public interface FoodRepository extends CrudRepository<FoodItem, String> {
    FoodItem findByFoodName(String foodName);
}
