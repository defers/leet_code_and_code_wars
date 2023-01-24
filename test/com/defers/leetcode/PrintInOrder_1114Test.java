package com.defers.leetcode;

import org.junit.Test;


public class PrintInOrder_1114Test {
    @Test
    public void testSolution() throws InterruptedException {
        PrintInOrder_1114 testClass = new PrintInOrder_1114();
        Thread thread1 = new Thread(() -> {
            try {
                testClass.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                testClass.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                testClass.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }

}