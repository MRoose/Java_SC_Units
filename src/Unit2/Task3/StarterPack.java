package Unit2.Task3;

import Unit2.Task2.Accessory;

import java.util.ArrayList;
import java.util.List;

public class StarterPack {
    private List<Accessory> stPack = new ArrayList<>();

    public StarterPack() {
        Accessory pen = new Accessory(5, 11.99, "Ручка");
        Accessory pencil = new Accessory(2, 5, "Карандаш");
        Accessory eraser = new Accessory(1, 2.5, "Ластик");
        Accessory notepad = new Accessory(3, 25, "Блокнот");
        Accessory pencilBox = new Accessory(1, 25, "Карандашница");

        stPack.add(pen);
        stPack.add(pencil);
        stPack.add(eraser);
        stPack.add(notepad);
        stPack.add(pencilBox);
    }

    public List<Accessory> getStPack() {
        return stPack;
    }
}
