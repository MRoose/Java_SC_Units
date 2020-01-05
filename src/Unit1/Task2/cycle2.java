package Unit1.Task2;

import java.util.ArrayList;

public class cycle2
{
    public ArrayList result(ArrayList list)
    {
        ArrayList result = new ArrayList();

        int i = 0;
        do {
            result.add((int) list.get(i + 1) * (int) list.get(i));
            i += 2;
        }
        while (i < (list.size() - 1));

        return result;
    }
}
