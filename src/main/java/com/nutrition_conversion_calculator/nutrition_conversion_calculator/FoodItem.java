package com.nutrition_conversion_calculator.nutrition_conversion_calculator;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class FoodItem {

    @Id
    private String foodName;
    @Enumerated(EnumType.ORDINAL)
    private FoodType foodType;
    private float servingWeight;
    private float calorie;
    private float fat;
    private float carbohydrate;
    private float fibre;
    private float protein;

    /**
     * Standard use constructor for food objects. Includes optional fibre field instantiation.
     * 
     * @param foodName descriptive name of the food item
     * @param foodType primary macronutrient of the food
     * @param servingWeight the number of grams (g) in one serving of food
     * @param calorie number of calories per serving of food
     * @param fat number of grams of fat per serving of food
     * @param carbohydrate number of grams of carbs per serving of food
     * @param fibre number of grams of fiber per serving of food
     * @param protein number of grams of protein per serving of food
     */
    public FoodItem(String foodName, FoodType foodType, float servingWeight, float calorie, float fat, float carbohydrate, float fibre, float protein) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.servingWeight = servingWeight;
        this.calorie = calorie;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.fibre = fibre;
        this.protein = protein;
    }

    /**
     * Alternate user constructor for food objects. Does not have a fibre field.
     * 
     * @param foodName descriptive name of the food item
     * @param foodType primary macronutrient of the food
     * @param servingWeight the number of grams (g) in one serving of food
     * @param calorie number of calories per serving of food
     * @param fat number of grams of fat per serving of food
     * @param carbohydrate number of grams of carbs per serving of food
     * @param protein number of grams of protein per serving of food
     */
    public FoodItem(String foodName, FoodType foodType, float servingWeight, float calorie, float fat, float carbohydrate, float protein) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.servingWeight = servingWeight;
        this.calorie = calorie;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
    }

    /**
     * Empty constructor used by jakarta for persistence. Do not use when manually creating objects
     */
    protected FoodItem() {
        this(
            null,
            null, 
            0f, 
            0f, 
            0f, 
            0f,
            0f,
            0f
        );
    }
    
    /**
     * Gets the name of the food as a string.
     * @return The name of the food.
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Sets the name of the food.
     * @param foodName New name for the food object.
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * Gets the dominant food category of the food item {PROTEIN, CARBOHYDRATE, FAT}.
     * TODO check if this gets the ordinal value or the enum by name from database;
     * @return The primary type of nutrient in the food.
     */
    public FoodType getFoodType() {
        return foodType;
    }

    /**
     * Sets the dominant food category of the food item.
     * @param foodType New type of dominant nutrient.
     */
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    /**
     * Gets the weight of a serving of the food in grams (g).
     * @return The number of grams (g) in a single serving.
     */
    public float getServingWeight() {
        return servingWeight;
    }

    /**
     * Sets the number of grams (g) in a serving of food.
     * @param servingWeight New number of grams (g) in a serving.
     */
    public void setServingWeight(float servingWeight) {
        this.servingWeight = servingWeight;
    }

    /**
     * Gets the caloric value of the food as a float in grams (g).
     * @return The amount of calories in the food.
     */
    public float getCalorie() {
        return calorie;
    }

    /**
     * Sets the calories of the food in grams (g).
     * @param calorie New amount of calories in the food.
     */
    public void setCalorie(float calorie) {
        this.calorie = calorie;
    }

    /**
     * Gets the amount of fat in the food in grams (g).
     * @return The amount of fat in the food.
     */
    public float getFat() {
        return fat;
    }

    /**
     * Sets the fat of the food in grams (g).
     * @param fat New amout of fat in the food.
     */
    public void setFat(float fat) {
        this.fat = fat;
    }

    /**
     * Gets the amount of carbohydrates in the food in grams (g).
     * @return The amount of carbohydrates in the food.
     */
    public float getCarbohydrate() {
        return carbohydrate;
    }

    /**
     * Sets the carbohydrates in the food in grams (g).
     * @param carbohydrate New amount of carbohydrates in the food.
     */
    public void setCarbohydrate(float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    /**
     * Gets the amount of fibre in the food in grams (g).
     * @return The amount of fibre in the food.
     */
    public float getFibre() {
        return fibre;
    }

    /**
     * Sets the fibre in the food in grams (g).
     * @param fibre The amount of fibre in the food.
     */
    public void setFibre(float fibre) {
        this.fibre = fibre;
    }

    /**
     * Gets the amount of protein in the food in grams (g).
     * @return The amount of protein in the food.
     */
    public float getProtein() {
        return protein;
    }

    /**
     * Sets the protein in the food in grams (g).
     * @param protein The amount of protein in the food.
     */
    public void setProtein(float protein) {
        this.protein = protein;
    }

}
