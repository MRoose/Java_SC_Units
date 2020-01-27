package Unit1.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов : ");
        int matrixSize = in.nextInt();


        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int y = 0; y < matrixSize; y++) {
                System.out.print(matrix[i][y]);
            }
            System.out.println();
        }
    }
}