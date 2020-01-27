package Unit1.Task6;

//import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
//        Record ntp = new Record();
//        Scanner in = new Scanner(System.in);
//        int select;
//
//        while (true) {
//            System.out.println("Введите номер действия :\n" +
//                    "1 - Создать\n" +
//                    "2 - Удалить\n" +
//                    "3 - Редактировать\n" +
//                    "4 - Показать все записи\n");
//
//            select = in.nextInt();
//
//            switch (select) {
//                case 1:
//                    ntp.Create();
//                    break;
//
//                case 2:
//                    ntp.Delete();
//                    break;
//
//                case 3:
//                    ntp.Edit();
//                    break;
//
//                case 4:
//                    ntp.ShowAllRecords();
//                    break;
//
//                default:
//                    System.out.println("Такого варианта еще нет.");
//                    break;
//
//            }
//         }
        NotepadMethods ntp = new NotepadMethods();

        ntp.create("Часть1", "Есть великая книга \"Тысячеликий герой\".\n" +
                "Держу пари, ее продажи подскочат,\n" +
                "Я прочел ее в Киеве этой дикой весной.\n" +
                "Как в запое, уйдя в одиночество, меня бросил язык мой,\n" +
                "Был полный тупик, ты не знаешь, что это такое.\n" +
                "Все гадали – бухает или готовит релиз? Я же просто сидел на балконе.\n");

        ntp.create("Часть2", "После, в дело пошла деконструкция.\n" +
                "Все врага развинтили старательно.\n" +
                "Но под всей психологией кухонной\n" +
                "Лежит коллективная бессознательность.\n");

        ntp.showAllRecords();
        System.out.println();

        ntp.edit("Часть1", "Почему например у Джокера нету собственного кино?\n" +
                "Есть у Бэтмена, CatWoman, Бэтмена с Робином, а у него ничего.\n" +
                "Почему нет игры, где ты - типа грибок и ты прыгаешь на СуперМарио?\n" +
                "А если б была – это был бы прикол, миллионы в игру не играли бы.\n");

        ntp.delete("Часть2");
        System.out.println();
        ntp.showAllRecords();
    }
}
