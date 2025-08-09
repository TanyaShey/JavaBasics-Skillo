package Lecture3.homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 11;
        int guess;
        int attempts = 0;

        do {
            if (attempts != 0) {
                System.out.println("Please try again");
            }
            System.out.println("Enter the guess");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("This is the number");
                break;
            } else if (number > guess) {
                System.out.println("Number is higher");
            } else {
                System.out.println("Number is lower");
            }

            attempts++;
        } while (attempts < 10);

        if (attempts == 10) {
            System.out.println("Ha-ha-ha!!! Better luck next time!");
        }
    }
}
