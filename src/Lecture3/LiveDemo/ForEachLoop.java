package Lecture3.LiveDemo;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {2, 25, 75, 351, 5};

        for (int item : numbers) {
            System.out.println(item);

            if (item == 75) {
                System.out.println("This is the number!" + item);
            }
        }

        String[] names = {"Mitko", "Vidko", "Pitko"};
        for (String name : names) {
            System.out.println("My name is " + name);
        }
    }
}
