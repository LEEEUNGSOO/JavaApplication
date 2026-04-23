package com.multi.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StreamEx {
    public static void main(String[] args) throws Exception{


        BufferedReader br=new BufferedReader(new FileReader(new File(new String(""))));
        try(br){

        }catch (Exception e){

        }
//        try(BufferedReader br=new BufferedReader(new FileReader(new File(new String(""))));){
//
//        }catch (Throwable ee){
//
//        }
//        try{
//            br=new BufferedReader(fr=new FileReader(new File(new String(""))));
//        }catch (Exception e){
//
//        }finally {
//            try {
//                if(fr!=null)fr.close();
//                if(br!=null)br.close();
//
//            }catch (Exception e){
//
//            }
//        }
    }
}
