package com.linyoulin.stack4;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        while (true) {
            myStack.push();
        }
    }

}
