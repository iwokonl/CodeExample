package com.example.Wstęp;

import java.util.ArrayList;
import java.util.List;

public class Interations {

    static void main(String[] args) {

        List<String> arrayLists = new ArrayList<>();
        arrayLists.add("Element 1");
        arrayLists.add("Element 2");
        arrayLists.add("Element 3");

        System.out.println();

        List<Integer> arrayInts = List.of(1, 2, 3, 4, 5);

        for (String element : arrayLists) {
            System.out.println(element);
        }

        System.out.println();


        for(int i = 0; i < arrayInts.size(); i++) {
            System.out.println("Index: " + i + ", Value: " + arrayInts.get(i));
        }

        System.out.println();

        int i = 0;
        boolean flag = true;
        while (i<arrayInts.size()) {
//            if (i>= arrayInts.size()) {
//                break;
//            }
            System.out.println("Index: " + i + ", Value: " + arrayInts.get(i));
            i++;
            flag = false;
        }

        System.out.println();

        System.out.println("Stream");

        var listStream = arrayLists.stream()
                .filter(element -> element.equals("Element 1"))
                .toList();

        System.out.println(listStream);

        System.out.println();

        System.out.println("Stream filtered");

        System.out.println();

        arrayLists.stream()
                .forEach(System.out::println);

    }


}
