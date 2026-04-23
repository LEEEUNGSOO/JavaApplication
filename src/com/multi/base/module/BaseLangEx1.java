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
        if(data instanceof String )
        System.out.println(((String)(data)).charAt(0));
        if(data instanceof Integer )
        System.out.println(((Integer)(data)).intValue());
        if(data instanceof Double )
            System.out.println(((Double)(data)).doubleValue());

    }
    public void objectMethod3(){
        String str1=new String("abc");
        String str2=new String("abc");
        System.out.println(str1==str2);//false
        System.out.println(str1.hashCode()==str2.hashCode());
        String str3="java";//암시적
        String str4="spring";
        System.out.println(str3.startsWith("j"));//true
        System.out.println(str4.startsWith("j"));//false
        System.out.println( str3.equals(str3));//true
        System.out.println( str3.equals("JAVA"));//false

    }

    public static void main(String[] args) {
        BaseLangEx1 base=new BaseLangEx1();
//        base.objectMethod2("Hello");
//        base.objectMethod2(10);
          base.objectMethod3();

    }
}
