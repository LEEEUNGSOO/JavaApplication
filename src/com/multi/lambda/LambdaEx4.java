package com.multi.lambda;

public class LambdaEx4 {
    public static void main(String[] args) {
//        Calc1 c=new Calc1() {
//            @Override
//            public void calc(int x, int y) {
//                System.out.println(x+y);
//            }
//        };
//        c.calc(100,200);

        Calc1 c=(x,y)-> System.out.println(x+y);
        c.calc(100,200);
    }
}
