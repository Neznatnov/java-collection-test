package com.neznatnov;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("красный");
        hashSet.add("оранжевый");
        hashSet.add("желтый");
        hashSet.add("зеленый");
        hashSet.add("голубой");
        hashSet.add("синий");
        hashSet.add("фиолетовый");

        System.out.println(hashSet);

        hashSet.remove("желтый");

        boolean searchElement = hashSet.contains("оранжевый");
        System.out.println(searchElement);

        Iterator<String> iterator = hashSet.iterator();
        do {
            String element = iterator.next();
            System.out.println(element);
        } while (iterator.hasNext());


    }
}
