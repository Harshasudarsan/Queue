package org.harsha;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Iterable<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        T data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (T item : this) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = front;
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = queue[index];
                index = (index + 1) % capacity;
                count++;
                return data;
            }
        };
    }
}
