package com.multi.inheritance;

public class ImageUploader  extends FileUploader{
    @Override
    public void upload() {
        System.out.println("ImageUploader");
    }
}
