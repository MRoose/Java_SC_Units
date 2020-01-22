package Unit1.Task5;

public class Main {
    public static void main(String[] args) {
//        int[][] reserve = {{1, 0, 0, 0, 0, 1},
//                           {0, 1, 0, 0, 1, 0},
//                           {0, 0, 1, 1, 0, 0},
//                           {0, 1, 0, 0, 1, 0},
//                           {1, 0, 0, 0, 0, 1}};
//
//        Matrix mmm = new Matrix();
//        //mmm.setMatrix(null);
//        mmm.setMatrix(reserve);
//        mmm.getMatrix();


        int[][] matrix = new int[5][6];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 6; y++) {
                if (((x == 0 || x == 4) && (y == 0 || y == 5)) ||
                        ((x == 1 || x == 3) && (y == 1 || y == 4)) ||
                        (x == 2 && (y == 2 || y == 3))) {
                    matrix[x][y] = 1;
                } else matrix[x][y] = 0;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(matrix[i][y]);
            }
            System.out.println();
        }
    }
}
