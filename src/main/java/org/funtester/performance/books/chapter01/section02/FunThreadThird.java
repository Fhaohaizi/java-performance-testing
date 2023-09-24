package org.funtester.performance.books.chapter01.section02;

/**
 * 使用Lambda语法实现Java多线程
 */
public class FunThreadThird {

    /**
     * 主线程
     * @param args
     */
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello FunTester!    " + Thread.currentThread().getName())).start();// 创建启动线程
        System.out.println("Hello FunTester!    " + Thread.currentThread().getName());// 打印线程名称
    }


}
