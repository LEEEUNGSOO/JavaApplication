package com.multi.oop;

//static(정적)변수,메소드,클래스
//static ==공통 ,클래스소속 ,객체없이 사용
public class StaticEx1 {
    private int instanceValue;
    static int staticValue;

    public void increment(){
        int localValue=0;
        localValue++;
        this.instanceValue++;
        StaticEx1.staticValue++;
        System.out.println("localValue="+localValue);
        System.out.println("instanceValue="+instanceValue);
        System.out.println("staticValue="+staticValue);

    }
    public static void main(String[] args) {
        //staticValue=10;
        StaticEx1 s1=new StaticEx1();
        StaticEx1 s2=new StaticEx1();
        s1.increment();
        s1.increment();
        s1.increment();
        s2.increment();

    }

}
