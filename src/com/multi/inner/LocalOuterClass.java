package com.multi.inner;

import javax.swing.*;

public class LocalOuterClass extends JFrame {
    //멤버inner,staticInner,LocalInner
    private int outerValue;
    public LocalOuterClass(){

    }
    public void method1(){//메소드
        int localValue=100;
        class LocalInner extends JButton{
            public LocalInner(){
                outerValue=100;//외부클래스 속성에 접근 가능(private)
            }
        }
    }
    public void method2(){
        class LocalInner2 extends JPanel{

        }
        LocalInner2 i2=new LocalInner2();

    }

    public static void main(String[] args) {

    }
}
