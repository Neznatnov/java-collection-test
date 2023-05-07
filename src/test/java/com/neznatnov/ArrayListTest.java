package com.neznatnov;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("красный");
        list.add("оранжевый");
        list.add("желтый");
        list.add("зеленый");
        list.add("голубой");
        list.add("синий");
        list.add("фиолетовый");

        list.remove("фиолетовый");

        boolean searchElement = list.contains("синий");

        System.out.println(searchElement);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
