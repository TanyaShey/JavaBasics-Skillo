package Lecture2.homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is my Homework 2");
        System.out.println("--- TASK 5 ---");

        System.out.println("What type of vacation do you prefer? (Beach | Mountain): ");
        String typeOfVacation = sc.nextLine().toLowerCase();

        switch (typeOfVacation) {

            case "beach":
                System.out.println("What is your budget per day per person for this vacation? ");
                double beachBudgetPerDay = sc.nextDouble();
                if (beachBudgetPerDay <= 0) { //да се помисли колко да е минималната сума достатъчна за ваканция в Бг
                    System.out.println("You don't have any money for a vacation!");
                } else if (beachBudgetPerDay < 50) {
                    System.out.println("You should go on a vacation in Bulgaria.");
                } else {
                    System.out.println("You can afford to go on a vacation outside Bulgaria.");
                }
                break;

            case "mountain":
                System.out.println("What is your budget per day per person for this vacation? ");
                double mountainBudgetPerDay = sc.nextDouble();
                if (mountainBudgetPerDay <= 0) { //да се помисли колко да е минималната сума достатъчна за ваканция в Бг
                    System.out.println("You don't have any money for a vacation!");
                } else if (mountainBudgetPerDay < 30) {
                    System.out.println("You should go on a vacation in Bulgaria.");
                } else {
                    System.out.println("You can afford to go on a vacation outside Bulgaria.");
                }
                break;

            default:
                System.out.println("There is no information about this type of vacation. Please choose only 'Beach' or 'Mountain'.");
        }
    }
}
