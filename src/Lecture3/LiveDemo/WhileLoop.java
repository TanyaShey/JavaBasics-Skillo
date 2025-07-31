package Lecture3.LiveDemo;

public class WhileLoop {

    public static void main(String[] args) {

        boolean controlStatement = true;
        int number = 0;

        while (controlStatement) {
            System.out.println(number);

            number++;

            if (number > 10) {
                controlStatement = false;
            }
        }

    }
}
