package com.example.Wstęp;

// Przykład instrukcji if-else if-else
public class Conditionals {

    static void main(String[] args) {
        // Definiowanie warunków
        // Warunki czyli typ wawrunkowy boolean (przyjmuje wartości true lub false)
        // Jest też wraper do typu boolean - Boolean

        boolean mainIf = true;
        boolean mainElseIf = true;

        // Instrukcja warunkowa if-else if-else
        if (mainIf){
            System.out.println("Warunek jest spełniony");
        } else if (mainElseIf) {
            System.out.println("Warunek else if jest spełniony");
        } else {
            System.out.println("Warunek nie jest spełniony");
        }
    }

}
