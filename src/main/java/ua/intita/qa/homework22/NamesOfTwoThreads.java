package ua.intita.qa.homework22;

public class NamesOfTwoThreads {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            Thread.currentThread().setName("NameOfFirst");
            System.out.println(Thread.currentThread().getName() +  " is running");
        });

        Thread threadTwo = new Thread(() -> {
            Thread.currentThread().setName("NameOfSecond");
            System.out.println(Thread.currentThread().getName() + " is running");
        });
        threadOne.start();
        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadTwo.start();
        try {
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

