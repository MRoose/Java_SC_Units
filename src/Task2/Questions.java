package Task2;

import java.util.ListResourceBundle;

public class Questions extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {
            {"q1", "Спутник Земли?"},
            {"q2", "Был ученым, стал зеленым."},
            {"q3", "Город на воде."},
            {"q4", "Последняя пандемия."},
            {"q5", "Сколько пикселей в 4K разрешении?"}
    };
}
