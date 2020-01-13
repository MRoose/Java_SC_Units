package Unit1.Task2;

import java.util.ArrayList;

public class cycle1
{
    public ArrayList result(ArrayList list)
    {
        ArrayList result = new ArrayList();

        for (int i = 0; i < list.size() - 1; i++)
        {
            if(i % 2 == 0)
            {
                result.add((int) list.get(i + 1) * (int) list.get(i));
            }
        }

        return result;
    }
}
