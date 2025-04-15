package org.harsha;

public class LinkedQueue<T> {


    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;


    public LinkedQueue() {
        front = null;
        rear = null;
    }


    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (rear != null) {
            rear.next = newNode;
        }

        rear = newNode;

        if (front == null) {
            front = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        T value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }


    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return front.data;
    }


    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node<T> current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
