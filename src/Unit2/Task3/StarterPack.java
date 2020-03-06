package Unit2.Task3;

import Unit2.Task2.Accessory;

import java.util.ArrayList;
import java.util.List;

public class StarterPack extends Accessory {
    private List<Accessory> stPack = new ArrayList<>();

    public StarterPack(int count1, double cost1, String name1) {

        stPack.add(new Accessory(5, 11.99, "Ручка"));
        stPack.add(new Accessory(2, 5, "Карандаш"));
        stPack.add(new Accessory(1, 2.5, "Ластик"));
        stPack.add(new Accessory(3, 25, "Блокнот"));
        stPack.add(new Accessory(1, 25, "Карандашница"));
    }

    public List<Accessory> getStPack() {
        return stPack;
    }
}
