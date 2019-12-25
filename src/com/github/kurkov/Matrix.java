package com.github.kurkov;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        boolean[][] matrix = new boolean[0][];

        System.out.print("Input matrix length (odd number): ");

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        if (length % 2 == 0) {
            System.out.println("Input only odd numbers (1, 3, 5, ... )");
        } else {
            matrix = new boolean[length][length];
            buildMatrix(matrix);
        }

        printMatrix(matrix);
    }

    private static void buildMatrix(boolean[][] matrix) {
        int j = 0;
        int k = matrix.length - 1;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][j] = true;
            j++;

            matrix[i][k] = true;
            k--;
        }
    }

    private static void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == true) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
