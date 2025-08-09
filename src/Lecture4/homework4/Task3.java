package Lecture4.homework4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] multiArray = {
                {5, 4, 6, 8},  //row 0
                {1, 9, 11, 2}, //row 1
                {3, 7, 12, 10} //row 2
        };
        System.out.println("Please enter row: ");
        int row = sc.nextInt();
        System.out.println("Please enter column: ");
        int col = sc.nextInt();

        if (row < 0) {
            System.out.println("Negative rows are not supported");
        }
        else if (col < 0) {
            System.out.println("Negative columns are not supported");
        }
        else if (row > multiArray.length) {
            System.out.println("We don't have row: " + row);
        }
        else if (col > multiArray[row].length) {
            System.out.println("We don't have col: " + col);
        } else {
            System.out.println("The value of row " + row + " and column " + col + " is: " + multiArray[row][col]);
        }
    }
}
