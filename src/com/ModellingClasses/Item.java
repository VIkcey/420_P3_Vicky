package com.ModellingClasses;

public class Item {

//      These are my fields
        private String name;
        private double price;

        // Constructor
        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // Getters
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{name='" + name + "', price=" + price + "}";
        }

}
