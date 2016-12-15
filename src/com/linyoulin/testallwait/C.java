package com.linyoulin.testallwait;

import com.linyoulin.test.*;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class C {
    private String lock;
    public C(String lock) {
        super();
        this.lock = lock;
    }
    public void getValue() {
        try {
            synchronized (lock) {
                while ("".equals(ValueObject.value)) {
                    System.out.println("processor " + Thread.currentThread().getName() + " wait !   ");
                    lock.wait();
                }
                System.out.println("processor " + Thread.currentThread().getName() + " running !   ");
                ValueObject.value = "";
                // lock.notify(); -- error
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
