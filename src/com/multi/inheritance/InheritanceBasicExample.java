package com.multi.inheritance;

public class InheritanceBasicExample {
    public static void main(String[] args) {
        Developer dev=new Developer();




        Developer dev2=new Developer();
        dev.name="민수";
        dev.employeeId=101;
        dev.mainLanguage="java";


        dev.showInfo();
        dev.goToWork();
        dev2.coding();

    }
}
