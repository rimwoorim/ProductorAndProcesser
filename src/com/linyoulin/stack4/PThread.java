package com.linyoulin.stack4;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class PThread extends Thread {
    private P p;

    public PThread(P p) {
        super();
        this.p = p;
    }

    public void run() {
        while (true) {
            p.pushService();
        }
    }

}
