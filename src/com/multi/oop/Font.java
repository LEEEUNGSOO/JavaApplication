package com.multi.oop;

public class Font extends Object{
    private String face;
    private int size;
    private String color;
    public Font(){
        this("");
    }
    public Font(String face){
        //this.face=face;
        this(face,0);
    }
    public Font(String face,int size){
        this(face,size,"");
    }
    public Font(String face,int size,String color){
        this.face=face;
        this.size=size;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Font{" +
                "face='" + face + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Font f1= new Font("궁서",15,"red");
        System.out.println(f1);

    }

}
