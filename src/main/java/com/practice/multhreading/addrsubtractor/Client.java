package com.practice.multhreading.addrsubtractor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.execute(subtractor);
        threadPool.execute(adder);


        try{
            threadPool.shutdown();
            threadPool.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count.getValue());
    }
}
