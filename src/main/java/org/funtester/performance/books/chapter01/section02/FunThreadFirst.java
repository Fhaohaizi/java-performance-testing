package org.funtester.performance.books.chapter01.section02;

/**
 * 继承{@link Thread}实现Java多线程
 */
public class FunThreadFirst extends Thread {

    /**
     * 主线程
     * @param args
     */
    public static void main(String[] args) {
        new FunThreadFirst().start();// 启动线程
        System.out.println("Hello FunTester!    " + Thread.currentThread().getName());// 打印线程名称
    }

    /**
     * 重写{@link Thread#run()}方法
     */
    @Override
    public void run() {
        try {
            Thread.sleep(100);// 睡眠100毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();// 打印异常堆栈
        }
        System.out.println("Hello FunTester!    " + Thread.currentThread().getName());// 打印线程名称
    }

}
