package com.practice.multhreading.addrsubtractor;

public class Adder implements Runnable {

    private final Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            //System.out.println("Adding");
            int currentValue = this.count.getValue();
            currentValue += 1;
            this.count.setValue(currentValue);
        }
    }
}
