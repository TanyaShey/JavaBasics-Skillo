package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is my Homework 1");

        System.out.println();
        System.out.println("--- TASK 1 ---");

        String firstName = "Tanya";
        String surname = "Yaroslavova";
        String lastName = "Sheytanova";

        System.out.println("My name is " + firstName + " " + surname + " " + lastName + ".");

        System.out.println();
        System.out.println("--- TASK 2 AND TASK 3 ---");

        System.out.println("Please enter the length of side A: ");
        int sideA = scanner.nextInt();
        System.out.println("Please enter the length of side B: ");
        int sideB = scanner.nextInt();
        System.out.println("Please enter the length of side C: ");
        int sideC = scanner.nextInt();

        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
                double perimeter = sideA + sideB + sideC;
                double semiPerimeter = perimeter/2;
                double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
                System.out.println("The perimeter of the triangle is: " + perimeter);
                System.out.println("The area of the triangle is: " + area);
            } else {
                System.out.println("This is not a valid triangle.");
            }
        } else {
            System.out.println("All of the sides must be positive numbers.");
        }

        System.out.println();
        System.out.println("--- TASK 4 ---");

        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= rows - 1; j++) {
            System.out.print(" ");
        }
        System.out.println("H");

        System.out.println();
        System.out.println("--- TASK 6 ---");

        long minutesInADay = 24 * 60;
        long minutesInAYear = minutesInADay * 365;

        System.out.print("Enter minutes: ");
        long minutes = scanner.nextLong();

        long years = minutes / minutesInAYear;
        long remainingMinutes = minutes % minutesInAYear;
        long days = remainingMinutes / minutesInADay;

        System.out.println("The given amount of " + minutes + " minutes equals " + years + " years and " + days + " days.");
    }
}