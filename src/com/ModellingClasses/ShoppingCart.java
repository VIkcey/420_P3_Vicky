package com.ModellingClasses;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {


    private List<Item> items;

    // Constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Add an item to the shopping cart
    public void addItem(Item item) {
        items.add(item);
    }

    // Remove an item from the shopping cart
    public void removeItem(Item item) {
        items.remove(item);
    }

    // Get the total price of all items in the cart
    public double getTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // For displaying items in the cart
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

}

