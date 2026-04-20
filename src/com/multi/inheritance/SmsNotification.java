package com.multi.inheritance;

public class SmsNotification extends Notification{
    public SmsNotification(){

    }
    public void send(){
        super.send();
        System.out.println("Sms Notification");

    }
}
