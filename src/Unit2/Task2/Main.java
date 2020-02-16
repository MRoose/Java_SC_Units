package Unit2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Accessory pen = new Accessory(5, 11.99);
        Accessory pencil = new Accessory(2, 5);
        Accessory eraser = new Accessory(1, 2.5);

        System.out.println(getSummary(pen, pencil, eraser)); //1й способ

        List<Accessory> list = new ArrayList<>(); //2й способ4
        list.add(pen);
        list.add(pencil);
        list.add(eraser);
        System.out.println(getSummary(list));
    }

    //private static double getSummary(Accessory ... obj) //1й способ
    private static double getSummary(List<Accessory> obj) { //2й способ
        double summary = 0;

        for (Accessory a : obj) {
            summary += a.getCost();
        }
        return summary;
    }
}


