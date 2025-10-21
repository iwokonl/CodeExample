package com.example.Lession_II.DesignPatterns.strategy;

import java.util.List;

public class Main {

    public static LinuxSystem linuxSystem = new LinuxSystem();
    public static MacOsSystem macOsSystem = new MacOsSystem();
    public static WindowsSystem windowsSystem = new WindowsSystem();

    public static List<Strategy> strategies = List.of(
        linuxSystem,
        macOsSystem,
        windowsSystem
    );
    public static void main(String[] args) {

        Strategy strategyExample = null;
        for (Strategy strategy : strategies) {
            strategy.openWindow();
        }


    }
}
