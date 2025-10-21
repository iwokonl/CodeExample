package com.example.Lession_II.OOP;

import java.util.Objects;

public class Pies implements ISzczekanie{

    private byte waga;
    private String imie;

    public Pies(){
    }

    public  Pies(byte waga, String imie){
        this.waga = waga;
        this.imie = imie;
    }

    @Override
    public void szczekaj() {
        System.out.println("Pies hau hau");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public byte getWaga() {
        return waga;
    }

    public void setWaga(byte waga) {
        this.waga = waga;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pies pies = (Pies) o;
        return waga == pies.waga && Objects.equals(imie, pies.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waga, imie);
    }
}
