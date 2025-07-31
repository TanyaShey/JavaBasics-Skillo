package Lecture3.LiveDemo;

public class BreakStatement {

    public static void main(String[] args) {

        int number = 1;

        while (true) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;

            if (number == 1002) {
                break;

            }
        }

        System.out.println("----------------");

        int numberTwo = 5;
        while (numberTwo < 11) {
            System.out.println("============");
            System.out.println("1. Number is: " + numberTwo);
            if (numberTwo == 7) {
                System.out.println("2. My numer is == 7");
                break;
            }
            if (numberTwo < 9) {
                System.out.println("3. Number is less than 9");
            }
            numberTwo++;
            System.out.println("4. Number increased by 1. New number is: " + numberTwo);
        }
        System.out.println("5. End code");
    }
}
