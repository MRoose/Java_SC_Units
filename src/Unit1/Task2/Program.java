package Unit1.Task2;

public class Program {
    public static void main(String[] args) {
        int arr[] = getArrayWithNumbers(200);

        output(SomeCycles.cycle1(arr));
        output(SomeCycles.cycle2(arr));
        output(SomeCycles.cycle3(arr));
    }

    public static int[] getArrayWithNumbers(int maxValue) {
        int[] arr = new int[maxValue / 2];

        for (int i = 0, j = 2; i < arr.length; i++, j += 2) {
            arr[i] = j;
        }
        return arr;
    }

    public static void output(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if(i != numbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

class SomeCycles {
    public static int[] cycle1(int numbers[]) {
        int[] temp = new int[numbers.length / 2];

        for (int i = 0, j = 0; i < temp.length; i++, j += 2) {
            temp[i] = numbers[j] * numbers[j + 1];
        }

        return temp;
    }

    public static int[] cycle2(int numbers[]) {
        int[] temp = new int[numbers.length / 2];

        int i = 0, j = 0;
        do {
            temp[i] = numbers[j] * numbers[j + 1];
            i++;
            j += 2;
        } while (i < temp.length);

        return temp;
    }

    public static int[] cycle3(int numbers[]) {
        int[] temp = new int[numbers.length / 2];

        int i = 0, j = 0;
        while (i < temp.length) {
            temp[i] = numbers[j] * numbers[j + 1];
            i++;
            j += 2;
        }

        return temp;
    }
}

