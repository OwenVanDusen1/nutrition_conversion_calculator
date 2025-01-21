package com.nutrition_conversion_calculator.nutrition_conversion_calculator;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CRUD operations to access repository of food items.
 */
public interface FoodRepository extends JpaRepository<FoodItem, String> {
    FoodItem findByFoodName(String foodName);
}
