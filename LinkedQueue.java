package org.harsha;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue<T> {
    private Queue<T> queue = new LinkedList<>();


    public void enqueue(T data) {           // adding queue to ata
        queue.add(data);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue.poll();
    }

    public T peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue.peek();
    }


    public boolean isEmpty() { // checing where empty
        return queue.isEmpty();
    }
}
