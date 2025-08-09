package Lecture4.LiveDemo;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Array list size: " + arrayList.size());

        arrayList.add(25);
        arrayList.add(55);
        arrayList.add(6);

        System.out.println("Array list new size: " + arrayList.size());

        System.out.println("Array list values: " + arrayList);

        arrayList.sort(Integer::compareTo);
        System.out.println("Array list after sorting: " + arrayList);

        arrayList.remove(1);
        System.out.println("Array list values after removed element index 1: " + arrayList);

        arrayList.set(1, 230);
        System.out.println("Array list values after updated element index 1: " + arrayList);

        arrayList.add(2355);
        arrayList.add(235);
        arrayList.add(2521);
        arrayList.add(2, 5);
        System.out.println("Array list new size: " + arrayList.size());
        System.out.println("Array list values: " + arrayList);

        System.out.println("Array list value on position 3 is: " + arrayList.get(3));
        for (int number : arrayList) {
            System.out.println("Current number from Array List is: " + number);
        }
    }
}
