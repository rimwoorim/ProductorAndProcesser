package com.linyoulin.test;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class ThreadC implements Runnable {
    private C c;

    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
