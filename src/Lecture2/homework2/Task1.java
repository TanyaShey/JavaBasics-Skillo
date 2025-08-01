package Lecture2.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is my Homework 2");
        System.out.println("--- TASK 1 ---");


        System.out.print("Please input angle 1: ");
        int angle1 = sc.nextInt();

        System.out.print("Please input angle 2: ");
        int angle2 = sc.nextInt();

        System.out.print("Please input angle 3: ");
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum != 180 || angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("This is not a valid triangle. Please try again.");
        } else {

            // Triangle type based on its sides
            String sides;
            if (angle1 == angle2 && angle2 == angle3) {
                sides = "equilateral";
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                sides = "isosceles";
            } else {
                sides = "multifaceted";
            }

            // Triangle type based on its angles
            String angles;
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                angles = "right-angled";
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                angles = "obtuse";
            } else {
                angles = "acute";
            }
            System.out.println("The triangle is " + sides + " and " + angles + ".");

        }
    }
}
