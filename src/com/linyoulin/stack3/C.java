package com.linyoulin.stack3;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
