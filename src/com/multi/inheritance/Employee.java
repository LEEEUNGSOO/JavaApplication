package com.multi.inheritance;

public class Employee {
    //설계도(클래스)  속성+기능
     String name;
     int employeeId;

    public void goToWork(){
        System.out.println(this.name+"님 출근합니다");
    }
    public void showInfo(){
        System.out.println("이름:"+this.name);
        System.out.println("사번:"+this.employeeId);

    }


}
