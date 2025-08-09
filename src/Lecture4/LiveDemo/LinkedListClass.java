package Lecture4.LiveDemo;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(253);
        linkedList.add(654);
        System.out.println("Linked list values: " + linkedList);

        linkedList.add(0, 555);
        linkedList.add(2, 333);
        System.out.println("Linked list values: " + linkedList);

        linkedList.remove(2);
        System.out.println("Linked list values: " + linkedList);
    }
}
