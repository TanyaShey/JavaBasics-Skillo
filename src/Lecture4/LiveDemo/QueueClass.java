package Lecture4.LiveDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(24);
        queue.add(33);
        queue.add(563);
        queue.add(5212);
        System.out.println(queue);

        System.out.println("Number of elements is queue: " + queue.size());

        queue.remove();
        System.out.println(queue);

        int numberOfElements = queue.size();
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Next element for iteration: " + queue.peek());
            System.out.println("Remove element: " + queue.poll());
            System.out.println(queue);
        }

        System.out.println("After all operations: " + queue);
    }
}
