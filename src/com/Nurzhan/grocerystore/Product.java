package com.Nurzhan.grocerystore;

public class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductID() { return productID; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setProductID(int productID) { this.productID = productID; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void restock(int N) {
        if (N > 0) {
            this.quantity += N;
            System.out.println(productName + " restocked. New quantity: " + this.quantity);
        }
    }

    public boolean sell(int N) {
        if (N > 0 && this.quantity >= N) {
            this.quantity -= N;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product [ID: " + productID + ", Name: " + productName +
                ", Price: $" + price + ", Stock: " + quantity + "]";
    }
}