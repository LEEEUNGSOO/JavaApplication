package com.multi.inheritance;

public class OverrideExample {
    public static void main(String[] args) {
//        Notification notification=new Notification();
//        notification.send();
//        EmailNotification emailNotification=new EmailNotification();
//        emailNotification.send();
//        SmsNotification smsNotification=new SmsNotification();
//        smsNotification.send();

          Notification notification=new SmsNotification();
          notification.send();

//          notification=new EmailNotification();
//
//          notification.send();




    }
}
