package com.linyoulin.stack1;

/**
 * 一生产一消费 操作栈
 * Created by linyo_000 on 2016/12/15.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C c = new C(myStack);
        P p = new P(myStack);
        PThread pt = new PThread(p);
        CThread ct = new CThread(c);
        pt.start();
        ct.start();

    }
}
