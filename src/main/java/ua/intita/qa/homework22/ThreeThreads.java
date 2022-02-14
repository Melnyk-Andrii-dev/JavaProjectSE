package ua.intita.qa.homework22;

import java.util.concurrent.*;

public class ThreeThreads {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        Thread secondThread = new Thread(new SecondThread());
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        System.out.println("Status before: " + firstThread.getState());

        firstThread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("");
        secondThread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("");
        Future<Integer> submit = executorService.submit(new ThirdThread());

        try {
            System.out.println(submit.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Status after: " + firstThread.getState());
    }
}

class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("Status within: " + Thread.currentThread().getState());
    }
}

class SecondThread implements Runnable {
    int first = 1;
    int second = 1;
    int result = 0;
    int temp = 0;

    @Override
    public void run() {
        while (true) {

            if (first < 100) {
                System.out.println(first);
            } else break;
            if (second < 100) {
                System.out.println(second);
            } else break;
            System.out.println(second);
            first = first + second;
            temp = second;
            second = second + first;
        }
    }
}

class ThirdThread implements Callable<Integer> {
    int sum = 0;

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) sum = sum + i;
        }
        return sum;
    }
}