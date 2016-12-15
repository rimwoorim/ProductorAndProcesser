package com.linyoulin.testallwait;


/**
 * Created by linyo_000 on 2016/12/15.
 */
public class P {
    private String lock;
    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!"".equals(ValueObject.value)) {
                    System.out.println("productor " + Thread.currentThread().getName() + " waiting ! ");
                    lock.wait();
                }
                System.out.println("productor " + Thread.currentThread().getName() + " running ! ");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                //lock.notify(); -- error
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
