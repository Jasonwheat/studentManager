package com.thread;

public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        MyThread m2 = new MyThread();
//        m1.run();
//        m2.run();
//        m1.setName("加特林");
//        m2.setName("哒哒哒");
        MyThread m1 = new MyThread("加特林");
        MyThread m2 = new MyThread("boerte");

//        m1.start();
//        m2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
