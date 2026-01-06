package com.Nurzhan.grocerystore;

public class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        setPrice(price);
        setQuantity(quantity);
    }

    public int getProductID() { return productID; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setProductID(int productID) { this.productID = productID; }
    public void setProductName(String productName) { this.productName = productName; }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
            this.price = 0;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity");
            this.quantity = 0;
        }
    }

    public boolean sell(int N) {
        if (N > 0 && this.quantity >= N) {
            setQuantity(this.quantity - N);
            return true;
        }
        return false;
    }

    public String getInfo() {
        return "ID: " + productID + " | Name: " + productName + " | Price: $" + price + " | Stock: " + quantity;
    }

    public String toString() {
        return getInfo();
    }
}