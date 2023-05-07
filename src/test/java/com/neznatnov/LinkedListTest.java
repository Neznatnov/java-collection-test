package com.neznatnov;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        Deque<String> linkedList = new LinkedList<>();
        linkedList.add("красный");
        linkedList.add("оранжевый");
        linkedList.add("желтый");
        linkedList.add("зеленый");
        linkedList.add("голубой");
        linkedList.add("синий");
        linkedList.add("фиолетовый");

        linkedList.removeFirst();

        System.out.println(linkedList);

        boolean searchElement = linkedList.contains("голубой");

        System.out.println(searchElement);
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
