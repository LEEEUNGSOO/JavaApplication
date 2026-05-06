package com.multi.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String soucreFile="C:\\KbWorkSpace\\javaStart\\JavaApp\\src\\com\\multi\\array\\ArrayEx1.java";
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream(soucreFile);
            int byteData;
            while((byteData=fileInputStream.read())!=-1){
                Thread.sleep(100);
                System.out.print((char)byteData);
            }
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try{
                if(fileInputStream!=null)fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
