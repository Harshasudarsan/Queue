package org.harsha;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        // Storing  (int, float, double as Number)
        Queue<Number> queue = new LinkedList<>();

        // Enqueue
        queue.add(10);
        queue.add(15.5f);
        queue.add(20.25);

        // Dequeue / Peek
        System.out.println("Dequeued: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeued: " + queue.poll());
    }
}
