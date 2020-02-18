package Unit2.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Accessory pen = new Accessory(5, 11.99, "Ручка");
        Accessory pencil = new Accessory(2, 5, "Карандаш");
        Accessory eraser = new Accessory(1, 2.5, "Ластик");

        System.out.println(getSummaryArgs(pen, pencil, eraser)); //1й способ

        List<Accessory> list = new ArrayList<>(); //2й способ
        list.add(pen);
        list.add(pencil);
        list.add(eraser);
        System.out.println(getSummaryList(list));
    }

    private static double getSummaryArgs(Accessory ... obj) {
        double summary = 0;

        for (Accessory a : obj) {
            summary += a.getCost();
        }
        return summary;
    }

    private static double getSummaryList(List<Accessory> obj) {
        double summary = 0;

        for (Accessory a : obj) {
            summary += a.getCost();
        }
        return summary;
    }
}


