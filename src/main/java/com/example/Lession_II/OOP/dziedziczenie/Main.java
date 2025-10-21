package com.example.Lession_II.OOP.dziedziczenie;

public class Main {
    static void main(String[] args) {
        // rzutowanie w dół (downcasting)
        Pies p = new Pudel("Kudłaty");
        p.szczekaj();
        System.out.println();

        // getter
        System.out.println(p.getImie());
        System.out.println();

        // settery
        p.setImie("Reksio");
        System.out.println(p.getImie());
        System.out.println();

        // abstrakcja przez interfejs
        ISzczekanie iSzczekanie = p;
        iSzczekanie.szczekaj();
        System.out.println();

        // rzutowanie w górę (upcasting)
        Pies pies = (Pies) p;
        pies.szczekaj();
        System.out.println();

        Pies pies2 = new Pies((byte) 15, "Burek");
        pies2.szczekaj();
        System.out.println(pies.equals(pies2));

    }
}
