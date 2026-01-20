package com.Nurzhan.grocerystore.Exception;

// Custom exceptions must extend the Exception class
public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}