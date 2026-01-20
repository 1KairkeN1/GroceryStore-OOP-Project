package com.Nurzhan.grocerystore.Classes;

import com.Nurzhan.grocerystore.Exception.InvalidPriceException;

public class FreshProduct extends Product {
    private String expiryDate;

    public FreshProduct(int productID, String productName, double price, int quantity, String expiryDate)
            throws InvalidPriceException {
        super(productID, productName, price, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Exp: " + expiryDate;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking freshness and expiration date for: " + getProductName());
    }
}