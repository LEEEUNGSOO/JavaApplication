package com.multi.oop;

public class StaticEx2 {
    private int data;
    private static StaticEx2 instance;
    private StaticEx2(){
        this.data=0;
    }
    public static StaticEx2 getInstnace(){
        if(instance==null)
            instance=new StaticEx2();
        return instance;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

}
