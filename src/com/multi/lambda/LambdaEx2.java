package com.multi.lambda;

public class LambdaEx2 {
    public static void main(String[] args) {
//        Task task=new Task() {
//            @Override
//            public void run() {
//                System.out.println("Task~");
//            }
//        };
//        task.run();
        Task task=()-> System.out.println("작업작업~");//
        task.run();
    }
}
