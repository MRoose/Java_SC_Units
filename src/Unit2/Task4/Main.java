package Unit2.Task4;

import java.util.Comparator;
import java.util.List;

import Unit2.Task3.StarterPack;
import Unit2.Task2.Accessory;

public class Main {
    public static void main(String[] args) {
        Comparator<Accessory> accessoryNameComparator = new AccessoryNameComparator();
        Comparator<Accessory> accessoryCostComparator = new AccessoryCostComparator();
        Comparator<Accessory> accessoryDoubleComparator = new AccessoryNameComparator().thenComparing(new AccessoryCostComparator());

        List<Accessory> listAcc = new StarterPack().getStPack();

        System.out.println("Без сортировки :");
        for(Accessory a : listAcc) {
            System.out.println(a.toString());
        }

        System.out.println("Сортировка по имени :");
        listAcc.sort(accessoryNameComparator);
        for(Accessory a : listAcc) {
            System.out.println(a.toString());
        }

        System.out.println("Сортировка по цене :");
        listAcc.sort(accessoryCostComparator);
        for(Accessory a : listAcc) {
            System.out.println(a.toString());
        }

        System.out.println("Сортировка по имени, затем цене :");
        listAcc.sort(accessoryDoubleComparator);
        for(Accessory a : listAcc) {
            System.out.println(a.toString());
        }
    }
}

class AccessoryNameComparator implements Comparator<Accessory> {
    public int compare(Accessory a, Accessory b) {
        return a.getName().compareTo(b.getName());
    }
}

class AccessoryCostComparator implements Comparator<Accessory> {
    public int compare(Accessory a, Accessory b) {
        return Double.compare(a.getCost(), b.getCost());
    }
}
