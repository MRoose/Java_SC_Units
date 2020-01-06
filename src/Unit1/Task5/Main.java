package Unit1.Task5;

public class Main
{
    public static void main(String[] args)
    {
        int[][] reserve = {{1, 0, 0, 0, 0, 1},
                           {0, 1, 0, 0, 1, 0},
                           {0, 0, 1, 1, 0, 0},
                           {0, 1, 0, 0, 1, 0},
                           {1, 0, 0, 0, 0, 1}};

        Matrix mmm = new Matrix();
        //mmm.setMatrix(null);
        mmm.setMatrix(reserve);
        mmm.getMatrix();
    }
}
