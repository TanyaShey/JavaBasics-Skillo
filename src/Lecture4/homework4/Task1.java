package Lecture4.homework4;

public class Task1 {
    public static void main(String[] args) {

        int[] arrayNumbers = {5, 14, 56, 23, 871, 25, 732};
        int sum = 0;

        for (int number : arrayNumbers) {
            sum = sum + number;
        }
        System.out.println("The sum of the elements in array is: " + sum);
    }
}
