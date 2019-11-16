package com.mvn.thready;

public class Producer extends Thread {
    private Place place;
    private int number;

    public Producer(Place c, int number) {
        place = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            place.put(i);
            System.out.println("Producer #" + this.number + " put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}
