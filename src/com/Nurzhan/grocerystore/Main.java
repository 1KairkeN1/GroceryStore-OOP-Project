package com.Nurzhan.grocerystore;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(101, "Nurzhan", 150.0, true);
        Product p1 = new Product(501, "Bread", 4.50, 20);
        Workers e1 = new Workers(201, "Nursultan", 15.0); // Changed Employee to Worker

        System.out.println("--- Start ---");
        System.out.println(c1.toString());
        System.out.println(p1.toString());
        System.out.println(e1.toString());

        System.out.println("\n--- Processing Transactions ---");

        c1.addPurchase(60.0);
        System.out.println("Customer Discount: " + (c1.calculateDiscount() * 100) + "%");

        boolean sold = p1.sell(2);
        if (sold) {
            System.out.println("Transaction successful. Remaining stock: " + p1.getQuantity());
        }

        e1.logHours(8.0);
        System.out.println(e1.getName() + "'s Paycheck: $" + e1.calculatePaycheck());

        System.out.println("\n--- End ---");
        System.out.println(c1.toString());
        System.out.println(p1.toString());
        System.out.println(e1.toString());
    }
}