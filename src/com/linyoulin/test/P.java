package com.linyoulin.test;


/**
 * Created by linyo_000 on 2016/12/15.
 */
public class P {
    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!"".equals(ValueObject.value)) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是:" + value);
                ValueObject.value = value;
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
