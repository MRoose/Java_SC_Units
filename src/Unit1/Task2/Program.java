package Unit1.Task2;

public class Program {
    public static void main(String[] args) {
        //ArrayWork.cycle1(ArrayWork.getNumbList(200));
        //ArrayWork.cycle2(ArrayWork.getNumbList(200));
        ArrayWork.cycle3(ArrayWork.getNumbList(200));
    }
}

class ArrayWork {

    public static int[] getNumbList(int maxValue) {
        int[] arr = new int[maxValue / 2];

        for (int i = 0, j = 2; i < arr.length; i++, j += 2) {
            arr[i] = j;
        }
        return arr;
    }


    public static void cycle1(int numbers[]) {
        int[] temp = new int[numbers.length / 2];

        for (int i = 0, j = 0; i < temp.length; i++, j += 2) {
            temp[i] = numbers[j] * numbers[j + 1];
        }

        output(temp);
    }

    public static void cycle2(int numbers[]) {
        int[] temp = new int[numbers.length / 2];

        int i = 0, j = 0;
        do {
            temp[i] = numbers[j] * numbers[j + 1];
            i++;
            j += 2;
        } while (i < temp.length);

        output(temp);
    }

    public static void cycle3(int numbers[]) {
        int[] temp = new int[numbers.length / 2];

        int i = 0, j = 0;
        while (i < temp.length) {
            temp[i] = numbers[j] * numbers[j + 1];
            i++;
            j += 2;
        }

        output(temp);
    }

    public static void output(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

