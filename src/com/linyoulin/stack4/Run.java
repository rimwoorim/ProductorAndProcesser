package com.linyoulin.stack4;

/**
 * 多生产一消费 操作栈  testtest
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
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
