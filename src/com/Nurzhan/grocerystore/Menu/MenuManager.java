package com.Nurzhan.grocerystore.Menu;

import com.Nurzhan.grocerystore.Classes.*;
import com.Nurzhan.grocerystore.Exception.InvalidPriceException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager implements MenuInterface {
    private ArrayList<Product> inventory = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void displayMenu() {
        System.out.println("\n********** GROCERY STORE **********");
        System.out.println("list   - View all products");
        System.out.println("status - View maintenance status");
        System.out.println("exit   - Close the program");
        System.out.print("Enter command: ");
    }

    @Override
    public void run() {
        try {
            inventory.add(new FreshProduct(101, "Apple", 2.5, 50, "2026-12-01"));
            inventory.add(new ElectronicProduct(202, "Digital Scale", 25.0, 5, "Samsung"));
        } catch (InvalidPriceException e) {
            System.out.println("Initialization Error: " + e.getMessage());
        }

        while (true) {
            displayMenu();
            String choice = sc.next().toLowerCase();

            if (choice.equals("list")) {
                System.out.println("\n--- Current Inventory ---");
                for (Product p : inventory) {
                    System.out.println(p.getInfo());
                }
            } else if (choice.equals("status")) {
                System.out.println("\n--- Maintenance Report ---");
                for (Product p : inventory) {
                    p.performMaintenance(); // This calls the abstract method we implemented
                }
            } else if (choice.equals("exit")) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } else {
                System.out.println("Unknown command. Try again.");
            }
        }
    }
}