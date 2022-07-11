package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.Product;

import java.util.ArrayList;

public interface InterfaceShoppingCart {

    void displayProduct(Product p);

    void setShipingCart(ArrayList<Product> shipingCart);

    void setTotalPrice(Float TotalPrice);

    Float getPrice(ArrayList<Product> shoppingCart);
}
