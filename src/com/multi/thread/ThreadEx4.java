package com.multi.thread;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//글자가 떨어지는 Window
public class ThreadEx4 extends Frame  {
    public ThreadEx4(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                System.out.println("Closing");
                //new ThreadEx4();
                System.exit(0);
            }
        });
        this.setBounds(100,200,400,400);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new ThreadEx4();
    }



}
