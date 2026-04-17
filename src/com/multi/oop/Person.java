package com.multi.oop;

//객체 -->클래스
//객체생성 (필드,생성자,메소드,오버로딩,this,static,final)
//객체 (사물 그 자체)
//객체 (기능을 갖고 있는 데이타)

public class Person {
    private String name;
    private int age;
    private double height;

    public Person() {

    }
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public void setName(Person this, String name) {
        System.out.println("this="+this);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //    private static String nation;

    public static void main(String[] args) {
 //기본 자료형에서 참조 자료형까지
//        int data;
//        int []m=new int[5];
//        //Person p=new Person();
//        new Person().name="민서";
//        System.out.println(new Person().name);

 //설계도 (속성+기능)
      Person p1=new Person();//name|age|height
      Person p2=new Person();//name|age|height
      System.out.println("p1="+p1);
      System.out.println("p2="+p2);

        p1.setName("승연");
        p2.setName("재훈");
        System.out.println(p2.getName());




    }

}
