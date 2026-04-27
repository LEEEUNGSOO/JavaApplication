package com.multi.thread;

public class ThreadEx3 implements  Runnable{
    int data;
    @Override
    public void run() {//Thread객체 돌고 있다
        System.out.println("ThreadEx3 Run");
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args) {
        ThreadEx3 t1=new ThreadEx3();//
        Thread thread1=new Thread(t1);//
        thread1.start();//Thread클래스 RUN이 불려지고  그 run에서 target.run()호출하면 ThreadEx3에 run이 불려진다
        Thread thread2=new Thread(t1);//
        thread2.start();
    }
}
