package com.victor;

public class Main {

    public static void main(String[] args) {


        printSquareStar(8);
    }

    /*
Print diagonals to generate a rectangular pattern composed of stars (*).
For each row and column, stars are printed based on four conditions:
- in the first or last row
- in the first or last column
- when the row number equals the column number
- when the column number equals rowCount - currentRow + 1
*/
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if ((i == 1) || (i == number) || (j == 1) || (j == number) || (i == j) || (j == number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
