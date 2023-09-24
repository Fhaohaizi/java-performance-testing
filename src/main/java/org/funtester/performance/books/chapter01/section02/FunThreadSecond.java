package org.funtester.performance.books.chapter01.section02;

/**
 * 实现{@link Runnable}接口实现Java多线程
 */
public class FunThreadSecond implements Runnable {

    /**
     * 主线程
     * @param args
     */
    public static void main(String[] args) {
        FunThreadSecond second = new FunThreadSecond();// 创建runnable实例
        new Thread(second).start();// 启动线程
        System.out.println("Hello FunTester!    " + Thread.currentThread().getName());// 打印线程名称
    }

    /**
     * 重写{@link Runnable#run()}方法
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
