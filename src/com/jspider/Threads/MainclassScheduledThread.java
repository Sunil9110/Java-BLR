package com.jspider.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainclassScheduledThread {
    public static void main(String[] args) {
        System.out.println("Main starts");
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores="+cores);
        ExecutorService es1 = Executors.newScheduledThreadPool(cores);
        Runnable task1 =()-> {
            System.out.println("Running task1");
        };
        for (int i=1; i<=5; i++) {
            es1.submit(task1);
        }
        es1.shutdown();


        System.out.println("Main ends");
    }
}
