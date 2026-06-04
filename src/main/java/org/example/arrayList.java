package org.example;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(0);
        list.add(2);
        list.add(5);

        System.out.println(list);

        // get element
        int element = list.get(1);
        System.out.println(element);
    }
}
