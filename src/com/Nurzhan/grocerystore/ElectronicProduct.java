package com.Nurzhan.grocerystore;

public class ElectronicProduct extends Product {
    private String brandName;

    public ElectronicProduct(int productID, String productName, double price, int quantity, String brandName) {
        super(productID, productName, price, quantity);
        this.brandName = brandName;
    }

    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }

    @Override
    public String getInfo() {
        // We use super.getInfo() to get the ID, Name, and Price from the Parent
        return super.getInfo() + " | Brand: " + brandName;
    }
}