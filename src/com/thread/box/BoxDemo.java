package com.thread.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer p = new Producer(b);

        Customer c = new Customer(b);
        //创造生产者线程和消费者线程
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}
