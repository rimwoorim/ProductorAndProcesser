package com.linyoulin.test;

/**
 * 一生产一消费:操作值 P158
 * Created by linyo_000 on 2016/12/15.
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP tp = new ThreadP(p);
        Runnable rc = new ThreadC(c);
        Thread tc = new Thread(rc);

        tp.start();
        tc.start();
    }
}
