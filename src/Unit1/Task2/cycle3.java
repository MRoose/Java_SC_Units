package Unit1.Task2;

import java.util.ArrayList;

public class cycle3
{
    public ArrayList result(ArrayList list)
    {
        ArrayList result = new ArrayList();

        int i = 0;
        while (i < list.size() - 1)
        {
            result.add(((int) list.get(i + 1)) * (int) list.get(i));
            i += 2;
        }

        return result;
    }
}
