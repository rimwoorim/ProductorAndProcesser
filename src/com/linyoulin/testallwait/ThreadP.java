package com.linyoulin.testallwait;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
