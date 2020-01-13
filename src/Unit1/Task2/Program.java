package Unit1.Task2;
import java.util.ArrayList;

public class Program
{
    public static void main(String[] args)
    {
        System.out.println("Список целых четных чисел: " + new ArrayCreator().getNumbList(200));
        System.out.println("Цикл for: " + new cycle1().result(new ArrayCreator().getNumbList(200)));
        System.out.println("Цикл do-while: " + new cycle2().result(new ArrayCreator().getNumbList(200)));
        System.out.println("Цикл while: " + new cycle3().result(new ArrayCreator().getNumbList(200)));
    }
}

