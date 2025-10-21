package com.example.Lession_II.OOP.dziedziczenie;

import java.util.Objects;

public final class Pudel extends Pies implements ISzczekanie{
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    private String rasa;

    @Override
    public void szczekaj() {
        System.out.println("Pudel hau hau");
    }

    public Pudel(String rasa){
        this.rasa = rasa;
        super((byte) 15, "Burek");
    }


//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Pudel pudel = (Pudel) o;
//        return Objects.equals(rasa, pudel.rasa);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(rasa);
//    }
}
