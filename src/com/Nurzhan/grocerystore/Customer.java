package com.Nurzhan.grocerystore;

public class Customer {
    private int customerID;
    private String name;
    private double totalPurchase;
    private boolean isMember;

    public Customer(int customerID, String name, double totalPurchase, boolean isMember) {
        this.customerID = customerID;
        this.name = name;
        this.totalPurchase = totalPurchase;
        this.isMember = isMember;
    }

    public int getCustomerID() {
        return customerID;
    }
    public String getName() {
        return name;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public boolean getIsMember() {
        return isMember;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setTotalPurchase(double totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }
    public void addPurchase(double amount) {
        if (amount > 0) {
            this.totalPurchase = this.totalPurchase + amount;
            System.out.println("Added purchase of $" + amount + " to " + this.name);
        } else {
            System.out.println("Invalid purchase amount.");
        }
    }
    public double calculateDiscount() {
        if (this.totalPurchase > 200.0) {
            return 0.10;
        } else {
            return 0.0;
        }
    }
    @Override
    public String toString() {
        return "Customer ID: " + customerID +
                ", Name: " + name +
                ", Total Spent: $" + totalPurchase +
                ", Member: " + isMember;
    }
}