package Unit1.Task6;

import java.util.Map;
import java.util.HashMap;

public class NotepadMethods {
    private Map<String, String> journal = new HashMap();

    public void create(String name, String body) {
        if (!journal.containsKey(name)) {
            journal.put(name, body);
        } else {
            errorHandler(0);
        }
    }

    public void delete(String name) {
        //System.out.println(journal.keySet());

        if (journal.containsKey(name)) {
            journal.remove(name);
        } else {
            errorHandler(1);
        }
    }

    public void edit(String name, String body) {
        if (journal.containsKey(name)) {
            journal.put(name, body);
        } else {
            errorHandler(1);
        }
    }

    public void showAllRecords() {
        for (Map.Entry<String, String> entry : journal.entrySet()) {
            System.out.printf(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static void errorHandler(int code) {
        String errorMessage = "";

        switch (code) {
            case 0:
                errorMessage = "Запись с таким название уже существует!";
                break;
            case 1:
                errorMessage = "Записи с таким названием нет!";
                break;
        }

        System.out.println(errorMessage);
    }
}
