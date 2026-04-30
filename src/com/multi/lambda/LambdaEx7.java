package com.multi.lambda;

class Computer{
    public int multiply(int x, int y) {
        return x * y; // 두 값을 곱해서 반환
    }
}
@FunctionalInterface
interface Calc4 {
    int calc(int x, int y); // 두 개의 정수를 받아 결과를 반환하는 함수형 인터페이스
}
public class LambdaEx7 {
    public static void main(String[] args) {
        Computer com=new Computer();
        //람다식
        Calc4 c1=(x,y)->com.multiply(x,y);
        Calc4 c2=com::multiply;
        System.out.println(c1.calc(10,20));
        System.out.println(c2.calc(10,20));


    }
}
