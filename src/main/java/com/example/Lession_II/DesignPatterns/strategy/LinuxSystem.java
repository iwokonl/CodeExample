package com.example.Lession_II.DesignPatterns.strategy;

public class LinuxSystem implements Strategy{
    @Override
    public void openWindow() {
        System.out.println("Otwieram okienko Linuxowe");
    }
}
