package Unit1.Task6;

public class NotepadEntry {
    public static void main(String[] args) {
        String s1 = "Есть великая книга \"Тысячеликий герой\".\n" +
                "Держу пари, ее продажи подскочат,\n" +
                "Я прочел ее в Киеве этой дикой весной.\n" +
                "Как в запое, уйдя в одиночество, меня бросил язык мой,\n" +
                "Был полный тупик, ты не знаешь, что это такое.\n" +
                "Все гадали – бухает или готовит релиз? Я же просто сидел на балконе.\n";

        String s2 = "После, в дело пошла деконструкция.\n" +
                "Все врага развинтили старательно.\n" +
                "Но под всей психологией кухонной\n" +
                "Лежит коллективная бессознательность.\n";

        String s3 = "Почему например у Джокера нету собственного кино?\n" +
                "Есть у Бэтмена, CatWoman, Бэтмена с Робином, а у него ничего.\n" +
                "Почему нет игры, где ты - типа грибок и ты прыгаешь на СуперМарио?\n" +
                "А если б была – это был бы прикол, миллионы в игру не играли бы.\n";

        Notepad ntp = new Notepad(5);

        arrayPrint(ntp.getNotepad());
        ntp.add(s1);
        ntp.add(s2);
        arrayPrint(ntp.getNotepad());
        ntp.remove(s2);
        arrayPrint(ntp.getNotepad());
        ntp.edit(s1, s3);
        arrayPrint(ntp.getNotepad());
    }

    private static void arrayPrint(String[] str) {
        for (String s : str) {
            if (s != null) {
                System.out.println(s);
            }
        }
        System.out.println("-----------------------------------------\n");
    }
}
