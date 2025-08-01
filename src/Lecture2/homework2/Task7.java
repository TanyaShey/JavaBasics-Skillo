package Lecture2.homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is my Homework 2");
        System.out.println("--- TASK 7 ---");

        System.out.print("Please enter a temperature: ");
        double temp = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Do you want to convert it to Celsius or Fahrenheit?: ");
        String directionOfConversion = sc.nextLine().toLowerCase();

        switch (directionOfConversion) {
            case "fahrenheit":
                double fahrenheit = temp * 9 / 5 + 32;
                System.out.println(temp + " °C = " + fahrenheit + " °F");
                break;

            case "celsius":
                double celsius = (temp - 32) * 5 / 9;
                System.out.println(temp + " °F = " + celsius + " °C");
                break;

            default:
                System.out.println("This is not a valid choice. Please choose between Celsius or Fahrenheit only.");
                break;
        }
    }
}
