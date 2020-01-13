package Unit1.Task6;

import java.util.HashMap;
import java.util.Scanner;

public class Record
{
    private HashMap<String, String> journal = new HashMap<>();
    Scanner in = new Scanner(System.in);

    public void Create()
    {
        System.out.println("Название : ");
        String strName = in.nextLine();
        if(!journal.containsKey(strName))
        {
            System.out.println("Содержимое : ");
            String strBody = in.nextLine();
            journal.put(strName, strBody);
            System.out.println("Запись Создана.");
        } else {
            System.out.println("Запись с таким названием существует, перехожу в режим редактирования.");
            Edit();
        }
    }

    public void Delete()
    {
        System.out.println("Выберите название : \n" + journal.keySet());
        String strName = in.nextLine();
        if(journal.containsKey(strName))
        {
            journal.remove(strName);
            System.out.println("Запись удалена.");
        } else {
            System.out.println("Такой записи не существует!");
        }
    }

    public void Edit()
    {
        System.out.println("Выберите название : \n" + journal.keySet());
        String strName = in.nextLine();
        if(journal.containsKey(strName))
        {
            System.out.println("Содержимое : ");
            String strBody = in.nextLine();
            journal.put(strName, strBody);
            System.out.println("Запись изменена.");
        } else {
            System.out.println("Такой записи не существует!");
        }
    }

    public void ShowAllRecords()
    {
        for (HashMap.Entry entry : journal.entrySet())
        {
            System.out.println("Название : " + entry.getKey() + " | Содержание : "
                    + entry.getValue());
        }
    }
}
