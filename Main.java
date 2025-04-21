package org.harsha;

public class Main {
    public static void main(String[] args) {

        ArrayQueue<Integer> intQueue = new ArrayQueue<>(4);
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("Integer Queue:");
        intQueue.printQueue();

        while (!intQueue.isEmpty()) {
            Integer removed = intQueue.dequeue();
            System.out.println("Dequeued (int): " + removed);
            intQueue.printQueue();
        }
        
        System.out.println();

        ArrayQueue<String> stringQueue = new ArrayQueue<>(4);
        stringQueue.enqueue("ONE");
        stringQueue.enqueue("TWO");
        stringQueue.enqueue("THREE");

        System.out.println("String Queue:");
        stringQueue.printQueue();

        while (!stringQueue.isEmpty()) {
            String removed = stringQueue.dequeue();
            System.out.println("Dequeued (string): " + removed);
            stringQueue.printQueue();
        }
    }
}
