package Unit1.Task3;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            calc(i);
        }
    }

    private static void calc(int step) {
        double result = Math.tan(2 * step) - 3;

        String dist = step + 1 >= 10 ? "   " : "    ";
        if (result < 0) {
            dist = dist.substring(1);
        }
        System.out.println(step + 1 + dist + result);
    }
}
