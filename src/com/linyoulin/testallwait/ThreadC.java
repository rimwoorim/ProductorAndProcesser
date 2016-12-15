package com.linyoulin.testallwait;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        super();
        this.c = c;
    }

    public void run() {
        while (true) {
            c.getValue();
        }
    }

}
