package com.Nurzhan.grocerystore.Classes;

import com.Nurzhan.grocerystore.Exception.InvalidPriceException;

public class ElectronicProduct extends Product {
    private String brandName;

    public ElectronicProduct(int productID, String productName, double price, int quantity, String brandName)
            throws InvalidPriceException {
        super(productID, productName, price, quantity); // Calls the abstract parent constructor
        this.brandName = brandName;
    }

    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Brand: " + brandName;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Testing battery and electrical safety for: " + getProductName());
    }
}