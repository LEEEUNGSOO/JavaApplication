package com.multi.interfaces.solid;

public class CardPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: "+amount);
    }

}
