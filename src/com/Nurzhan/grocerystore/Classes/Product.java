package com.Nurzhan.grocerystore.Classes;

import com.Nurzhan.grocerystore.Exception.InvalidPriceException;

public abstract class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) throws InvalidPriceException {
        this.productID = productID;
        this.productName = productName;
        setPrice(price);
        setQuantity(quantity);
    }

    public abstract void performMaintenance();

    public int getProductID() { return productID; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setProductID(int productID) { this.productID = productID; }
    public void setProductName(String productName) { this.productName = productName; }

    public void setPrice(double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative: " + price);
        }
        this.price = price;
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

    @Override
    public String toString() {
        return getInfo();
    }
}