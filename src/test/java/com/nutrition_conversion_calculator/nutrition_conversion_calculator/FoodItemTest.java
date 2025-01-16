package com.nutrition_conversion_calculator.nutrition_conversion_calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FoodItemTest {

    private FoodItem foodItem;

    @Before
    public void setUp() {
        foodItem = new FoodItem(
            "KD Original Macaroni and Cheese", 
            FoodType.CARBOHYDRATE, 
            85, 
            360, 
            2.5f, 
            61,
            2, 
            11);
    }

    @Test
    public void getFoodName() {
        String expectedName = "KD Original Macaroni and Cheese";
        String actualName = foodItem.getFoodName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setFoodName() {
        foodItem.setFoodName("Italipasta Baby Shells");
        String expectedName = "Italipasta Baby Shells";
        String actualName = foodItem.getFoodName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getFoodType() {
        FoodType expectedType = FoodType.CARBOHYDRATE;
        FoodType actualType = foodItem.getFoodType();
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void setFoodType() {
        foodItem.setFoodType(FoodType.PROTEIN);
        FoodType expectedType = FoodType.PROTEIN;
        FoodType actualType = foodItem.getFoodType();
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void getServingWeight() {
        float expectedWeight = 85;
        float actualWeight = foodItem.getServingWeight();
        Assert.assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void setServingWeight() {
        foodItem.setServingWeight(100);
        float expectedWeight = 100;
        float actualWeight = foodItem.getServingWeight();
        Assert.assertEquals(expectedWeight, actualWeight, 0.01);
    }

    @Test
    public void getCalorie() {
        float expectedCalorie = 360;
        float actualCalorie = foodItem.getCalorie();
        Assert.assertEquals(expectedCalorie, actualCalorie, 0.01);
    }

    @Test
    public void setCalorie() {
        foodItem.setCalorie(999);
        float expectedCalorie = 999;
        float actualCalorie = foodItem.getCalorie();
        Assert.assertEquals(expectedCalorie, actualCalorie, 0.01);
    }

    @Test
    public void getFat() {
        float expectedFat = 2.5f;
        float actualFat = foodItem.getFat();
        Assert.assertEquals(expectedFat, actualFat, 0.01);
    }

    @Test
    public void setFat() {
        foodItem.setFat(1.005f);
        float expectedFat = 1.005f;
        float actualFat = foodItem.getFat();
        Assert.assertEquals(expectedFat, actualFat, 0.01);
    }

    @Test
    public void getCarbohydrate() {
        float expectedCarbohydrate = 61;
        float actualCarbohydrate = foodItem.getCarbohydrate();
        Assert.assertEquals(expectedCarbohydrate, actualCarbohydrate, 0.01);
    }

    @Test
    public void setCarbohydrate() {
        foodItem.setCarbohydrate(10000);
        float expectedCarbohydrate = 10000;
        float actualCarbohydrate = foodItem.getCarbohydrate();
        Assert.assertEquals(expectedCarbohydrate, actualCarbohydrate, 0.01);
    }

    @Test
    public void getFibre() {
        float expectedFibre = 2;
        float actualFibre = foodItem.getFibre();
        Assert.assertEquals(expectedFibre, actualFibre, 0.01);
    }

    @Test
    public void setFibre() {
        foodItem.setFibre(0);
        float expectedFibre = 0;
        float actualFibre = foodItem.getFibre();
        Assert.assertEquals(expectedFibre, actualFibre, 0.01);
    }
    
    @Test
    public void getProtein() {
        float expectedProtein = 11;
        float actualProtein = foodItem.getProtein();
        Assert.assertEquals(expectedProtein, actualProtein, 0.01);
    }

    @Test
    public void setProtein() {
        foodItem.setProtein(2000);
        float expectedProtein = 2000;
        float actualProtein = foodItem.getProtein();
        Assert.assertEquals(expectedProtein, actualProtein, 0.01);
    }
}
