package com.pingwit.core.les_29.practice.point_2;

public class SummaryRunnable implements Runnable {
    private final Integer taskNumber;

    public SummaryRunnable(Integer taskNumber) {this.taskNumber = taskNumber;}

    @Override
    public void run() {
        System.out.println("Working " + taskNumber + ":" + Thread.currentThread().getName());
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("is done " + taskNumber + ":" + Thread.currentThread().getName());
    }
}
