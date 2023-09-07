package com.pingwit.core.les_30.point_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class LoginQueueUsingSemaphoreExample {
    private final Semaphore semaphore;

    public LoginQueueUsingSemaphoreExample(int slotLimit) {
        semaphore = new Semaphore(slotLimit);
    }

    void login() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    boolean tryLogin() {
        return semaphore.tryAcquire();
    }

    void logout() {
        semaphore.release();
    }

    int availableSlots() {
        return semaphore.availablePermits();
    }
}

class LoginQueueUsingSemaphoreExampleMain {

    public static void main(String[] args) {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginQueueUsingSemaphoreExample loginQueue = new LoginQueueUsingSemaphoreExample(slots);
        IntStream.range(0, slots).forEach(user -> executorService.execute(loginQueue::tryLogin));

        executorService.shutdown();

        System.out.println(loginQueue.availableSlots());
        System.out.println(loginQueue.tryLogin());

        loginQueue.logout();
        System.out.println(loginQueue.tryLogin());
    }
}
