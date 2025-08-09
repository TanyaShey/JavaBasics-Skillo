package Lecture4.LiveDemo;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] multiArray = {
                {5, 4, 6, 8},  //row 0
                {1, 9, 11, 2}, //row 1
                {3, 7, 12, 10} //row 2
        };

        for (int row = 0; row < multiArray.length; row++) {
//            System.out.println("Value of row is: " + row);
            for (int col = 0; col < multiArray[row].length; col++) {
                System.out.println("Value of row " + row + " and column " +col + " is: " +multiArray[row][col]);
                System.out.println("Value of row 2 and column 3 is: " +multiArray[2][3]);
            }
        }
    }
}
