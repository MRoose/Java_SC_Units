package Unit1.Task2;

import java.util.ArrayList;

public class ArrayCreator
{
    public ArrayList getNumbList(int maxValue)
    {
        ArrayList numbList = new ArrayList();

        for (int i = 2; i <= maxValue; i++)
        {
            if (i % 2 == 0)
            {
                numbList.add(i);
            }
        }

        return numbList;
    }
}
