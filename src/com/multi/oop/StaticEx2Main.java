package com.multi.oop;

public class StaticEx2Main {
    public static void main(String[] args) {
       // StaticEx2 s=new StaticEx2();
        StaticEx2.getInstnace().setData(100);
        System.out.println(StaticEx2.getInstnace().getData());
    }
}
