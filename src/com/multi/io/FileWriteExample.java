package com.multi.io;

import java.io.FileOutputStream;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath="c:\\ioEx\\hi.txt";
        String contents="Hello ,Java ByteStraem";
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream(filePath);
            fos.write(contents.getBytes());
            System.out.println("File OutPut Success~");
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try{
                if(fos!=null)fos.close();
            }catch (Exception e){
                e.printStackTrace();

            }
        }
    }
}
