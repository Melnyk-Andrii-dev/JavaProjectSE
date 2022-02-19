package ua.intita.qa.homework22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MinMaxThreads {
    public static void main(String[] args) {
        final int[] mass = new int[5000000];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = ThreadLocalRandom.current().nextInt(-100000000, 100000000);
        }

//        ExecutorService minFinderThread = Executors.newFixedThreadPool(3);
//        Future<Integer> min = minFinderThread.submit(() -> {
//            int min1 = Integer.MAX_VALUE;
//            for (int j : mass) {
//                if (min1 > j) min1 = j;
//            }
//            return min1;
//        });
//
//        ExecutorService maxFinderThread = Executors.newFixedThreadPool(3);
//        Future<Integer> max = maxFinderThread.submit(new MaxFinderThread(mass));

        List<Callable<Integer>> tasks = new ArrayList<>(2);
        Callable<Integer> task = () -> {
            int min1 = Integer.MAX_VALUE;
            for (int j : mass) {
                if (min1 > j) min1 = j;
            }
            return min1;
        };
        tasks.add(task);
        tasks.add(new MaxFinderThread(mass));
        ExecutorService service = Executors.newFixedThreadPool(2);
        try {
            List<Future<Integer>> futures = service.invokeAll(tasks);
            for (Future<Integer> future : futures) {
                System.out.println(future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();

//        try {
//            System.out.println("MIN: " + min.get());
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            System.out.println("MAX: " + max.get());
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//        minFinderThread.shutdown();
//        maxFinderThread.shutdown();

    }
}

class MaxFinderThread implements Callable<Integer> {
    private final int[] mass;

    MaxFinderThread(int[] mass) {
        this.mass = mass;
    }

    @Override
    public Integer call() throws Exception {
        int max = Integer.MIN_VALUE;
        for (int j : mass) {
            if (max < j) max = j;
        }
        return max;
    }
}
