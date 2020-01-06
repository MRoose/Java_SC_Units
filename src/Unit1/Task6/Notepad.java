package Unit1.Task6;

import java.util.Scanner;

public class Notepad
{
    public static void main(String[] args)
    {
        Record ntp = new Record();
        Scanner in = new Scanner(System.in);
        int select;

        while (true)
        {
            System.out.println("Введите номер действия :\n" +
                    "1 - Создать\n" +
                    "2 - Удалить\n" +
                    "3 - Редактировать\n" +
                    "4 - Показать все записи\n");

            select = in.nextInt();

            switch (select)
            {
                case 1:
                {
                    ntp.Create();
                    break;
                }
                case 2:
                {
                    ntp.Delete();
                    break;
                }
                case 3:
                {
                    ntp.Edit();
                    break;
                }
                case 4:
                {
                    ntp.ShowAllRecords();
                    break;
                }
                default:
                {
                    System.out.println("Такого варианта еще нет.");
                    break;
                }
            }
        }
    }
}
