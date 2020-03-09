package Unit1.Task3;

public class Program {
    public static void main(String[] args) {
        funcResult(1, 20, 2);
    }

    private static void funcResult(int from, int to, int step) {
        for (int x = from, iteration = 1; x < to; x += step, iteration++) {
            System.out.printf("%-5s %-5s %n", iteration, Math.tan(2 * x) - 3);
        }
    }
}