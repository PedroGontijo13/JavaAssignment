package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.Product;

import java.util.ArrayList;

public interface IShoppingCart {
    void displayProduct(Product p);
    void setTotalPrice(Float TotalPrice);
    Float getTotalPrice(ArrayList<Product> shoppingCart);
}
