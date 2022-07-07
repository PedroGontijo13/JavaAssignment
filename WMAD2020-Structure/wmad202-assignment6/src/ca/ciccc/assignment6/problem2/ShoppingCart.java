package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.*;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> ShipingCart = new ArrayList<>();
    public void buy() {
        Drink drink = new Drink(412, "Pepsi", 2F, "USA", false, 150);
        Drink drink1 = new Drink(183, "Ginger Zero", 8F,"CA", true, 200);
        Food food = new Food(100, "Chicken", 7F, "CA", 350, 3, new String[]{"Chicken", "Oleo", "Cheese"});
        Food food2 = new Food(101, "Pasta", 18F, "CA", 250, 3, new String[]{"Pasta", "MEET", "Spinach"});
        ArrayList<Material> materials= new ArrayList<>();
        Material material = new Material(10, "cotton");
        Material material1 = new Material(11, "Nylon");
        materials.add(material);
        materials.add(material1);
        Cloth cloth = new Cloth(701, "T-Shirt", 15F, "China", materials);
        ShipingCart.add(drink);
        ShipingCart.add(drink1);
        ShipingCart.add(food);
        ShipingCart.add(food);
        ShipingCart.add(food2);
        ShipingCart.add(food2);
        ShipingCart.add(cloth);
        System.out.println(getPrice(ShipingCart));
    }

    public Float getPrice(ArrayList<Product> shoppingCart) {
        Float total = 0F;
        for (Product p: ShipingCart) {
            total += p.getPoductPrice();
        }
        return total;
    }

}