package com.multi.interfaces;

import javax.swing.*;

public  class AWindowClass {

    public AWindowClass(){
        new AbstractWindowClass(){
            @Override
            public void mouseClicked() {
                super.mouseClicked();
            }
        };
    }



}
