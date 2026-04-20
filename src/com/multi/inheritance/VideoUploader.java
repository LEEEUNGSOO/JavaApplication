package com.multi.inheritance;

public class VideoUploader extends FileUploader{
    @Override
    public void upload() {
        System.out.println("VideoUploader");
    }
}
