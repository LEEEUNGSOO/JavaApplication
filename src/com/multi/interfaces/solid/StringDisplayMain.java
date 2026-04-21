package com.multi.interfaces.solid;

public class StringDisplayMain {
    public static void main(String[] args) {
        AbstractDisplay display=new StringDisplay("Hello");
        display.display();
    }
}
