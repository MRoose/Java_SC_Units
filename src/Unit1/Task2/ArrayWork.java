package Unit1.Task2;

public class ArrayWork {
    static int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50,
            52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106,
            108, 110, 112, 114, 116, 118, 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 152,
            154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200};


    public static void cycle1() {
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i] * numbers[i + 1]);
        }
    }

    public static void cycle2() {
        int i = 0;

        do {
            System.out.println(numbers[i] * numbers[i + 1]);
            i = i + 2;
        } while (i < numbers.length);
    }

    public static void cycle3() {
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i] * numbers[i + 1]);
            i = i + 2;
        }
    }
}
