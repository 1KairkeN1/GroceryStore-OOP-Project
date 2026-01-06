package com.Nurzhan.grocerystore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        inventory.add(new FreshProduct(501, "Bread", 4.50, 20, "2026-01-15"));
        inventory.add(new ElectronicProduct(601, "Scale", 55.0, 10, "Samsung"));

        Customer c1 = new Customer(101, "Nurzhan", 150.0, true);
        Workers e1 = new Workers(201, "Nursultan", 15.0);

        System.out.println("--- STORE SYSTEM ---");
        System.out.println("Commands: list, brand, status, exit");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = sc.next();

            if (command.equals("list")) {
                System.out.println("--- Current Inventory ---");
                for (Product p : inventory) {
                    System.out.println(p.getInfo());
                }
            }

            if (command.equals("brand")) {
                System.out.println("--- Electronic Brands ---");
                for (Product p : inventory) {
                    if (p instanceof ElectronicProduct) {
                        ElectronicProduct ep = (ElectronicProduct) p;
                        System.out.println(ep.getProductName() + ": " + ep.getBrandName());
                    }
                }
            }

            if (command.equals("status")) {
                System.out.println("--- People Records ---");
                System.out.println(c1.toString());
                System.out.println(e1.toString());
            }

            if (command.equals("exit")) {
                System.out.println("System closed.");
                break;
            }
        }
    }
}
