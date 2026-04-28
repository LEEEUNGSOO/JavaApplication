package com.multi.collection;

import java.util.ArrayList;
import java.util.HashSet;

//List,Set,Map
public class CollectionEx3 {

    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>(10);
        list1.add("딸기");
        list1.add("수박");
        list1.add("멜론");
        System.out.println(list1.toString());

        HashSet<Integer>set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(20);

        System.out.println(set1);




    }
}
