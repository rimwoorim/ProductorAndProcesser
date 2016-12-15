package com.linyoulin.testallwait;

/**
 * 多生产与多消费:操作值   ---仅是notify假死  P160
 * 多生产与多消费:操作值   ---用notifyALl()解决假死的问题
 * Created by linyo_000 on 2016/12/15.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("productor " + i);
            cThread[i] = new ThreadC(c);
            cThread[i].setName("processor" + i);
            pThread[i].start();
            cThread[i].start();
        }

        Thread.sleep(5000);

        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}
