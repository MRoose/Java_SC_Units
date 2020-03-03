package Unit1.Task6;

import java.util.Arrays;

public class Notepad {
    private String notepad[];

    public Notepad(int size) {
        notepad = new String[size];
    }

    public void add(String str) {
        int index = indexOfElement(null);

        if (index != -1) {
            notepad[index] = str;
        }
    }

    public void remove(String str) {
        int index = indexOfElement(str);

        if (index != -1) {
            notepad[index] = null;
        }
    }

    public void edit(String strOld, String strNew) {
        int index = indexOfElement(strOld);

        if (index != -1) {
            notepad[index] = strNew;
        }
    }

    public String[] getNotepad() {
        return notepad;
    }

    private int indexOfElement(String str) {
        return Arrays.asList(notepad).indexOf(str);
    }
}
