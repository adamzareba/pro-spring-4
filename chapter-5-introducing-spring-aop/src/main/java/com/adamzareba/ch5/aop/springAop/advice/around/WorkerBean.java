package com.adamzareba.ch5.aop.springAop.advice.around;

public class WorkerBean {

    public void doSomeWork(int noOfTimes) {
        for (int x = 0; x < noOfTimes; x++) {
            work();
        }
    }

    private void work() {
        System.out.print("");
    }
}

