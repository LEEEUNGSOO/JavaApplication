package com.multi.array;

import java.util.Arrays;

public class ArrayEx1 {
    //변수(instance)
    public void arrayDemo1(){
        int []m1=new int[5];//[][][][][]
        int []m2=new int[3];//[][][]
        int []m3=new int [2];//[][]
        m1=m2;
        for (int i=0;i<m1.length;i++){
            System.out.printf("%5d",m1[i]);
        }
        System.out.println();
    }
    public void arrayDemo2(){
        int []x=new int[]{10,20,30,40};
        for (int xx:x){
            System.out.printf("%5d",xx);
        }
    }
//    public void arrayDemo3(int ...x){
//        System.out.println(Arrays.toString(x));
//    }
    public void arrayDemo4(Object []xx){
        System.out.println(Arrays.toString(xx));
    }

    public int  arrayDemo5(int []y){
        return y[0];

    }
    public static void main(String[] args) {
        ArrayEx1 a=new ArrayEx1();
        //a.arrayDemo4(new Integer[]{10,20,30,40,50,60,70});
        //a.arrayDemo4(new String[]{"java","oracle","spring"});
        a.arrayDemo5(new int[]{10,20,30});
    }
}
