package com.mvn.thready;

public class Main {
    public static void main(String[] args) {
        Place c = new Place();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
}
