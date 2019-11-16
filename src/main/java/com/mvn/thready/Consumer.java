package com.mvn.thready;

public class Consumer extends Thread {
    private Place place;
    private int number;
    public Consumer(Place c, int number) {
        place = c;
        this.number = number;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = place.get();
            System.out.println("Consumer #" + this.number+ " got: " + value);
        }
    }
}
