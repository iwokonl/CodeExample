package com.example.Wstęp;

import java.util.*;

public class Collections {

    // Kolekcja zawsze powinna być w typie abstrakcyjnym (interfejsie) np. List, Set, Map
    // Implementacja może być różna np. ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap itp.
    // Wybór implementacji zależy od wymagań dotyczących wydajności i funkcjonalności.
    // List - uporządkowana kolekcja, pozwala na duplikaty
    // Set - nieuporządkowana kolekcja, nie pozwala na duplikaty
    // Map - kolekcja par klucz-wartość, klucze


    static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        System.out.println(map);

        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(10);
        set.add(5);
        System.out.println(set);

        Set<Integer> linkedSet = new LinkedHashSet<Integer>();
        linkedSet.add(5);
        linkedSet.add(10);
        linkedSet.add(5);
        System.out.println(linkedSet);




    }


}
