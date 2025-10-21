package com.example.Wstęp.Classes;

public class ExampleMainClass {

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass("Private Value", "Public Value");

        // Accessing public instance variable
        System.out.println("Public Instance Variable: " + example.publicInstanceVariable);


        // Accessing public static variable
        System.out.println("Public Static Variable: " + ExampleClass.publicStaticVariable);

    }
}
