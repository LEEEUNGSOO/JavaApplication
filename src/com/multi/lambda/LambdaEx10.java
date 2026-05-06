package com.multi.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEx10 {

    public static void main(String[] args) {
        // 문자열 리스트 생성
        List<String> list = Arrays.asList("Orange","apple", "Banana", "cherry");
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//          for(String s:list)
//              System.out.println(s);
        //list.forEach(x->System.out.println(x));
       // list.forEach(System.out::println);

        // 간단한 정렬 로직 (버블 정렬 개념)
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//
//                // compareToIgnoreCase로 비교
//                if (list.get(i).compareToIgnoreCase(list.get(j)) > 0) {
//
//                    // 자리 바꾸기 (swap)
//                    String temp = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, temp);
//                }
//            }
//        }
        //list.sort((a,b)->a.compareToIgnoreCase(b));
        //list.sort((a,b) ->a.compareToIgnoreCase(b));

        //list.sort(String::compareToIgnoreCase);
        //list.forEach(System.out::println);

        List<String>uperList=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        uperList.forEach(System.out::println);





    }
}
