package Lecture2.homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is my Homework 2");
        System.out.println("--- TASK 4 ---");

        System.out.println("Please enter single unit price: ");
        double pricePerSingleUnit = sc.nextDouble();
        System.out.println("Please enter unit quantity: ");
        int quantity = sc.nextInt();

        double discountRate = 0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 15;
        } else if (quantity > 120) {
            discountRate = 20;
        }

        double revenueBeforeDiscount = quantity * pricePerSingleUnit;
        double discountPrice = revenueBeforeDiscount * (discountRate * 0.01);
        double revenueAfterDiscount = revenueBeforeDiscount - discountPrice;

        System.out.println("The revenue from the sale is: " + revenueAfterDiscount);
        System.out.println("The discount is: " + discountPrice);
    }
}
