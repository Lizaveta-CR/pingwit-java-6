package com.pingwit.core.les_30.point_2;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentLockExample {
    private int amount;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public static void main(String[] args) {
        PaymentLockExample paymentLockExample = new PaymentLockExample();
        Thread thread = new Thread(paymentLockExample::doPayment);
        thread.start();
        paymentLockExample.init();
        System.out.println("The end");
    }

    public void doPayment() {
        try {
            System.out.println("Start payment(lock)");
            lock.lock();
            while (amount <= 0) {
                condition.await();
            }
            System.out.println("Payment(lock) is closed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void init() {
        try {
            lock.lock();
            System.out.println("Init amount: ");
            amount = new Scanner(System.in).nextInt();
        } finally {
            condition.signal();
            lock.unlock();
        }
    }
}
