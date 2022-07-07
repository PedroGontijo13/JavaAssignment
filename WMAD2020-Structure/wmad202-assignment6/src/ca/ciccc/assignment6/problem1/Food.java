package ca.ciccc.assignment6.problem1;

import java.util.ArrayList;

public class Food extends Product {
    private Integer foodCalorie;
    private Integer foodSize;
    private ArrayList<String> foodIngredients;
    Food(Integer FoodId, String FoodName, Float FoodPrice, String FoodMadeInCountry, Integer foodCalorie, Integer foodSize, ArrayList<String> foodIngredients) {
        super(FoodId, FoodName, FoodPrice, FoodMadeInCountry);
        this.foodCalorie = foodCalorie;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }
}
