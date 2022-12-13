package com.practice.multhreading.print1to100;

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
