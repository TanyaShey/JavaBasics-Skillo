package Lecture2.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is my Homework 2");
        System.out.println("--- TASK 2 ---");

        System.out.println("Please write the day number (1-7): ");
        int dayNumber = sc.nextInt();
        String weekDay;

        switch (dayNumber){
            case 1:
                weekDay = "Monday";
                System.out.println("The " + dayNumber + "-st day of the week is " + weekDay);
                break;
            case 2:
                weekDay = "Tuesday";
                System.out.println("The " + dayNumber + "-nd day of the week is " + weekDay);
                break;
            case 3:
                weekDay = "Wednesday";
                System.out.println("The " + dayNumber + "-rd day of the week is " + weekDay);
                break;
            case 4:
                weekDay = "Thursday";
                System.out.println("The " + dayNumber + "-th day of the week is " + weekDay);
                break;
            case 5:
                weekDay = "Friday";
                System.out.println("The " + dayNumber + "-th day of the week is " + weekDay);
                break;
            case 6:
                weekDay = "Saturday";
                System.out.println("The " + dayNumber + "-th day of the week is " + weekDay);
                break;
            case 7:
                weekDay = "Sunday";
                System.out.println("The " + dayNumber + "-th day of the week is " + weekDay);
                break;
            default:
                System.out.println("This is not a valid day of the week. Input only numbers 1-7.");
        }
    }
}
