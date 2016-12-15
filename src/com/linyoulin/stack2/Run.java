package com.linyoulin.stack2;

/**
 * 一生产多消费 操作栈
 * Created by linyo_000 on 2016/12/15.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C c0 = new C(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        P p = new P(myStack);
        PThread pt = new PThread(p);
        pt.start();
        CThread ct0 = new CThread(c0);
        CThread ct1 = new CThread(c1);
        CThread ct2 = new CThread(c2);
        CThread ct3 = new CThread(c3);
        CThread ct4 = new CThread(c4);
        ct0.start();
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
    }
}
