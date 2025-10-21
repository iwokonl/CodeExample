package com.example.Wstęp;

public class Variables {

    // Typ prymitywny to typ danych, który przechowuje pojedynczą wartość i jest przechowywany bezpośrednio w pamięci.
    // Przykłady typów prymitywnych w Javie to:
    // int - liczby całkowite
    // double - liczby zmiennoprzecinkowe
    // boolean - wartości logiczne (true/false)
    // char - pojedyncze znaki
    // Typ referencyjny to typ danych, który przechowuje odniesienie (adres) do obiektu w pamięci, a nie samą wartość.
    // Przykłady typów referencyjnych w Javie to:
    // String - łańcuchy znaków
    // Array - tablice
    // Class - klasy i obiekty


    static void main(String[] args) {
        int number = 10;
        double decimalNumber = 10.5;
        String text = "Hello, World!";
        boolean isTrue = true;
        char character = 'A';

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);
        System.out.println("String: " + text);
        System.out.println("Boolean: " + isTrue);
        System.out.println("Character: " + character);
    }
}
