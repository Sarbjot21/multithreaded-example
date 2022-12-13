package com.practice.multhreading.executor;

public class PrintNumber implements Runnable {
    private final int numberToPrint;

    public PrintNumber(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName() + " printing  : " + this.numberToPrint);
    }
}
