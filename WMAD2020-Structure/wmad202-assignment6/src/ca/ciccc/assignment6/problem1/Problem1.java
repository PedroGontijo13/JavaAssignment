package ca.ciccc.assignment6.problem1;

import java.util.ArrayList;

public class Problem1 {
    public void invoke() {
        Drink d = new Drink(110, "Diet Pepsi", 20F, "USA", true, 2);
        ArrayList<String> Ingredients = new ArrayList<>();
        Ingredients.add("Bread");
        Ingredients.add("Meet");
        Food f = new Food(120, "Hamburguer", 20F, "Brazil", 700, 2, Ingredients);
        Material m = new Material(12, "CUTTON");
        Material m2 = new Material(13, "leather");
        ArrayList<Material> MaterialsList = new ArrayList<>();
        MaterialsList.add(m);
        Cloth c = new Cloth(121, "Jacket", 120F, "CHINA", MaterialsList);
    }
}
