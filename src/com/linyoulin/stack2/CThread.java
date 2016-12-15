package com.linyoulin.stack2;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class CThread extends Thread {
    private C c;
    public CThread(C c) {
        super();
        this.c = c;
    }

    public void run() {
        while (true) {
            c.popService();
        }
    }
}
