package Lecture3.homework3;

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = {5, 91, -65, 4, 23, 56};
        int biggestNumber = numbers[0];

        for (int number : numbers) {
            if (biggestNumber < number) {
                biggestNumber = number;
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);

        int biggestNumberFor = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                biggestNumberFor = numbers[i];
                continue;
            }
            if (biggestNumberFor < numbers[i]) {
                biggestNumberFor = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + biggestNumberFor);
    }
}
