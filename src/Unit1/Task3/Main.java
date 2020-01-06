package Unit1.Task3;

public class Main
{
    public static void main(String[] args)
    {
        double start = 0;
        double stop = 10;
        double shagSize = 1;
        int shagNumber = 0;
        double result = 0;
        double x = 0;

        while (x <= stop)
        {
            x = start + shagNumber * shagSize;
            result = Math.tan(2 * x) - 3;
            System.out.println(x + " " + result);
            shagNumber++;
        }
    }
}
