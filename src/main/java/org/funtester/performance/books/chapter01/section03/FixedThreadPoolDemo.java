package org.funtester.performance.books.chapter01.section03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用{@link ExecutorService}实现Java多线程
 */
public class FixedThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);// 创建线程数为3的线程池
        for (int i = 0; i < 4; i++) {// 循环4次
            executorService.execute(new Runnable() {// 提交任务
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);// 睡眠100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(System.currentTimeMillis() + "  Hello FunTester!  " + Thread.currentThread().getName());//
                }
            });

        }
        executorService.shutdown();// 关闭线程池
    }

}
