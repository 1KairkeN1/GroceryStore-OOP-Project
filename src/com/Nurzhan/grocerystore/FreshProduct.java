package com.Nurzhan.grocerystore;

public class FreshProduct extends Product {
    private String expiryDate;

    public FreshProduct(int productID, String productName, double price, int quantity, String expiryDate) {
        super(productID, productName, price, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Exp: " + expiryDate;
    }
}
