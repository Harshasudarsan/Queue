package org.harsha;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);

        System.out.println("Initial queue:");
        queue.printQueue();

        System.out.println("\nDequeuing process:");

        while (!queue.isEmpty()) {
            int removed = queue.dequeue();
            System.out.println("Dequeued: " + removed);
            queue.printQueue();
        }

        System.out.println("\nQueue is now empty.");
    }
}
