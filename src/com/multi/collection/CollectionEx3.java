package com.multi.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//List,Set,Map
public class CollectionEx3 {

    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>(10);
        list1.add("딸기");
        list1.add("수박");
        list1.add("멜론");

//        for(int i=0;i<list1.size();i++){
//            System.out.println(list1.get(i));
//        }
//          for(String s :list1){
//              System.out.println(s);
//          }

        //System.out.println(list1.toString());
        //System.out.println( list1.get(1).startsWith("딸기"));
        Iterator<String>iter= list1.iterator();//반복자 객체
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        HashSet<Integer>set1=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(20);
        Iterator<Integer> it=set1.iterator();
        for(;it.hasNext();){
            System.out.println(it.next());
        }

        //System.out.println(set1);

    }
}
