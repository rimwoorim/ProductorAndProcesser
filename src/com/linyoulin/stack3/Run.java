package com.linyoulin.stack3;

/**
 * 多生产一消费 操作栈
 * Created by linyo_000 on 2016/12/15.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C c = new C(myStack);
        P p0 = new P(myStack);
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        PThread pt0 = new PThread(p0);
        PThread pt1 = new PThread(p1);
        PThread pt2 = new PThread(p2);
        PThread pt3 = new PThread(p3);
        PThread pt4 = new PThread(p4);
        pt0.start();
        pt1.start();
        pt2.start();
        pt3.start();
        pt4.start();
        CThread ct = new CThread(c);
        ct.start();
    }
}
