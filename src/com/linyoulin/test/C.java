package com.linyoulin.test;

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
                if ("".equals(ValueObject.value)) {
                    lock.wait();
                }
                System.out.println("get 的值是:" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
