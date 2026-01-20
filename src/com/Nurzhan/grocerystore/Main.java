package com.Nurzhan.grocerystore;

import com.Nurzhan.grocerystore.Menu.MenuInterface;
import com.Nurzhan.grocerystore.Menu.MenuManager;

public class Main {
    public static void main(String[] args) {
        // We use the Interface as the type (Polymorphism)
        MenuInterface app = new MenuManager();
        app.run();
    }
}