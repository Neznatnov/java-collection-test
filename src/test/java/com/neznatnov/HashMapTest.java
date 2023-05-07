package com.neznatnov;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("красный",1);
        hashMap.put("оранжевый",2);
        hashMap.put("желтый",3);
        hashMap.put("зеленый",4);
        hashMap.put("голубой",5);
        hashMap.put("синий",6);
        hashMap.put("фиолетовый",7);

        System.out.println(hashMap);

        hashMap.remove("голубой");
        System.out.println(hashMap);

        int searchElement = hashMap.get("зеленый");
        System.out.println(searchElement);

        Iterator<Integer> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("Значение: " + value);
        }
    }


    }

