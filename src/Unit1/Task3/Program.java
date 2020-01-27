package Unit1.Task3;

public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-5s %-5s %n", i + 1, funcResult(i));
        }
    }

    private static double funcResult(int step) {
        return Math.tan(2 * step) - 3;
    }
}
