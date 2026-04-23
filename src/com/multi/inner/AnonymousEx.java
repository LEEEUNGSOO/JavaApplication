package com.multi.inner;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class AnonymousEx extends Outer {

    ArrayList list=new ArrayList(){
        @Override
        public Iterator iterator() {
            return super.iterator();
        }
    };
    public void listAdd(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        AnonymousEx a=new AnonymousEx();
        a.listAdd();
    }
}
