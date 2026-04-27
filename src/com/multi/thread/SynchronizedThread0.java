package com.multi.thread;

public class SynchronizedThread0 implements  Runnable{
    private int money=100000;//공유자원

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void drawMoney(int howmoney) {
        if(getMoney()<=0) {
            return;
            //System.out.println("잔액이 없습니다 ");
        }else {
            this.money-=howmoney;
            System.out.println(Thread.currentThread().getName()+"잔액:"+this.getMoney()+"남았습니다");
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //System.out.println("Run"+ Thread.currentThread().getName());
        synchronized (this) {

            for (int i = 1; i <= 10; i++) {//synchronized가 없으면 동기화 문제 발생
                try {
                    Thread.sleep(1000);
                    drawMoney(1000);

                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }

            }
        }
    }//run

    public static void main(String[] args) {
        SynchronizedThread0 atm=new SynchronizedThread0();
        Thread mother=new Thread(atm,"엄마");
        Thread son=new Thread(atm,"아들");
        mother.start();
        son.start();

    }
}
