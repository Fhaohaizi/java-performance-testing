package org.funtester.performance.books.chapter01.section02;

public class FunThreadFirst extends Thread {

    public static void main(String[] args) {
        new FunThreadFirst().start();
        System.out.println("Hello FunTester!    " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello FunTester!    " + Thread.currentThread().getName());
    }

}
