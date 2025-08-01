package Lecture2.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is my Homework 2");
        System.out.println("--- TASK 3 ---");

        System.out.println("Please write your age ");
        int age = sc.nextInt();

        if (age < 1 || age > 120) {
            System.out.println("This is not a valid age. Please try again.");
        } else {

            if (age >= 16) {
                System.out.println("You are eligible to work!");
            } else {
                System.out.println("You are NOT eligible to work yet!");
            }

        }
    }
}
