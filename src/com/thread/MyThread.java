package com.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<100;i++) {
            System.out.println(getName() + ":" + i);
        }
    }

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
}
