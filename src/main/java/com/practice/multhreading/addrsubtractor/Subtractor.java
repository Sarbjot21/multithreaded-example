package com.practice.multhreading.addrsubtractor;

public class Subtractor implements Runnable {
    private final Count count;

    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Subtracting");
            int currentValue = this.count.getValue();
            currentValue -= 1;
            this.count.setValue(currentValue);
        }
    }
}
