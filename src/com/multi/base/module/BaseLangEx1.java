package com.multi.base.module;

public class BaseLangEx1 {

    public void objectMethod1(){
        Object obj=new Object();//기본 생성자로 생성
        System.out.println(obj.equals(new Object()));//false
        System.out.println(obj.equals(obj));

        System.out.println(obj.hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(obj.toString());
    }
    public void objectMethod2(Object data){
        System.out.println(((String)(data)).charAt(0));
        System.out.println(((Integer)(data)).intValue());
    }

    public static void main(String[] args) {
        BaseLangEx1 base=new BaseLangEx1();
        base.objectMethod2("Hello");
        base.objectMethod2(10);

    }
}
