package com.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    线程安全的类
 */
public class ThreadDemo {
    public static void main(String[] args) {
        List<String> str = Collections.synchronizedList(new ArrayList<>());

    }
}
