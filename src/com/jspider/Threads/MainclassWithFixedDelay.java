package com.jspider.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainclassWithFixedDelay {

        public static void main(String[] args) {
            System.out.println("Main starts");
            int cores = Runtime.getRuntime().availableProcessors();
            System.out.println("cores="+cores);
            ScheduledExecutorService es1 = Executors.newScheduledThreadPool(cores);
            Runnable task1 =()-> {
                System.out.println("Running task1");
            };
           es1.scheduleAtFixedRate(task1,5,5,TimeUnit.SECONDS);
            es1.shutdown();


            System.out.println("Main ends");
        }
    }


