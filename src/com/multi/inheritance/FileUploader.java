package com.multi.inheritance;

//abstractClass(완성 + 미완성)
public abstract class FileUploader {
    //완성기능
    public void connect(){
        System.out.println("서버에 연결합니다");
    }
    //미완성 기능
    public abstract void upload();
}
