package com.multi.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionEx7 {
    public static void main(String[] args) {
        HashMap<Integer,String>map1=new HashMap<>();
        map1.put(1,"이윤정");
        map1.put(2,"최이초");
        map1.put(3,"이윤정");
        map1.put(3,"이유주");
        //System.out.println(map1);
//        Iterator<Integer>iterator= map1.keySet().iterator();
//        while (iterator.hasNext()){
//            Integer key=iterator.next();
//            System.out.println("key="+key+" value="+map1.get(key));
//        }
         Iterator<Map.Entry<Integer,String>>iterator= map1.entrySet().iterator();

         while (iterator.hasNext()){
             Map.Entry<Integer,String>entry=iterator.next();
             System.out.println(entry.getValue());
         }



    }
}
