package com.practice.multhreading.threadpools;

import com.practice.multhreading.executor.PrintNumber;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // TRADITIONAL WAY TO EXECUTE THREADS
        //        for (int i = 1; i <= 100; i++) {
        //            new Thread(new PrintNumber(i)).start();
        //        }

        //MODERN WAY TO EXECUTE THREADS
    /*    Executor executor = Executors.newCachedThreadPool();
        for(int i = 1;i<=100;i++){
            executor.execute(new PrintNumber(i));
        }*/

        Executor fixedThreadPool = Executors.newFixedThreadPool(10);
        for(int i = 1;i<=100;i++){
            fixedThreadPool.execute(new PrintNumber(i));
        }
    }
}