package com.Nurzhan.grocerystore;

import com.Nurzhan.grocerystore.Menu.MenuInterface;
import com.Nurzhan.grocerystore.Menu.MenuManager;

public class Main {
    public static void main(String[] args) {
        MenuInterface app = new MenuManager();

        app.run();
    }
}