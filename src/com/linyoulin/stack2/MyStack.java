package com.linyoulin.stack2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyo_000 on 2016/12/15.
 */
public class MyStack {
    private List list = new ArrayList();

    synchronized public void push()  {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notifyAll();
            System.out.println("push = " + list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
                System.out.println("popping:" + Thread.currentThread().getName() + " is wait!");
                this.wait();
            }
            returnValue = (String) list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
