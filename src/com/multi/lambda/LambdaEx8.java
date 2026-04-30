package com.multi.lambda;
@FunctionalInterface
interface Compare {
    int compare(String a, String b); // 문자열 두 개를 비교하는 함수형 인터페이스
}
public class LambdaEx8 {
    public static void main(String[] args) {
        //람다식
        Compare c1=(a,b)->a.compareTo(b);
        Compare c2=String::compareTo;
        System.out.println(c1.compare("A","B"));//음수추력
        System.out.println(c2.compare("B","A"));
    }
}
