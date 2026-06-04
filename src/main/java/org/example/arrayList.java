package org.example;

import java.util.ArrayList;
import java.util.Collections;

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

        // Add in between element
        list.add(1,1);
        System.out.println(list);

        //Set element
        list.set(0,4);
        System.out.println(list);

        // Delete element
        list.remove(2);
        System.out.println(list);

        //Size
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
