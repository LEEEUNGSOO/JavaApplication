package com.multi.lambda;

public class LambdaEx3 {


    public static void main(String[] args) {
        LambdaEx3 lambdaEx3=new LambdaEx3();
//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("쓰레드실행");
//            }
//        });
//        t.start();

        Thread t=new Thread(()-> System.out.println("쓰레드실행~~~"));


    }
}
