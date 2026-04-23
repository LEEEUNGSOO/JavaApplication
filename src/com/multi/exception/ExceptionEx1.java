package com.multi.exception;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

//RunTime,Compile
public class ExceptionEx1 {
    public void arrayIndexOutOfBoundsException(){
        int []m=new int[5];
        for (int i = 0; i <=m.length ; i++) {
            try {
                m[i] = 10/(int)Math.random()*100;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }catch (ArithmeticException e){
//                Exception ee=new ArithmeticException();
//                ee=new ArrayIndexOutOfBoundsException();
            }catch (Exception e){

            }catch (Throwable e){

            }finally {

            }
        }//for
    }
    public void cloneNotSupportedException(){
        //ExceptionDemo e1=new ExceptionDemo();
        try {
          ExceptionEx1 e1=new ExceptionEx1();
          ExceptionEx1 e2=(ExceptionEx1)e1.clone();
            System.out.println(e2);
        }catch (Throwable e){
            e.printStackTrace();

        }
    }
    public void cloneNotSupportedException2()throws CloneNotSupportedException{
        ExceptionEx1 e=(ExceptionEx1) this.clone();
    }

    public static void main(String[] args)throws Exception {
        ExceptionEx1 e=new ExceptionEx1();
        e.cloneNotSupportedException2();
        //e.arrayIndexOutOfBoundsException();
        BufferedInputStream bi= new BufferedInputStream(new FileInputStream(new File(new String())));
        FileInputStream fi=new FileInputStream(new File(new String("")));
        try(bi;fi) {

        }catch (Exception ee){

        }




    }
}
