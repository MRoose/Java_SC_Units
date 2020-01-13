package Unit1.Task5;

import java.util.Scanner;

public class Matrix
{
    private int[][] matrix;

    public void setMatrix(int[][] values)
    {
        if (values == null)
        {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите кол-во столбцов : ");
            int colCount = in.nextInt();
            System.out.println("Введите кол-во строк : ");
            int rowCount = in.nextInt();

            matrix = new int[rowCount][colCount];

            for (int i = 0; i < rowCount; i++)
            {
                for (int j = 0; j < colCount; j++)
                {
                    System.out.println("Введите значение для строки " + i + " и столбца " + j + " : ");
                    matrix[i][j] = in.nextInt();
                }
            }
            in.close();
        } else {
            matrix = values;
        }
    }

    public void getMatrix()
    {
        if (matrix.length > 0)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[0].length; j++)
                {
                    System.out.print(" " + matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else System.out.println("Матрица не установлена!");
    }

}
