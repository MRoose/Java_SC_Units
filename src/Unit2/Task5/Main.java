package Unit2.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Рузвельт Мира");
        Student st2 = new Student("Пупкин Василий");
        Student st3 = new Student("Федеров Андрей");
        Student st4 = new Student("Комаров Алексей");
        Student st5 = new Student("Пушкин Александр");
        Student st6 = new Student("Абрамович Антон");
        Student st7 = new Student("Игнатьев Евгений");
        Student st8 = new Student("Миронов Владимир");
        Student st9 = new Student("Попов Геннадий");

        List<Integer> assListInt1 = new ArrayList<>();
        List<Integer> assListInt2 = new ArrayList<>();
        List<Integer> assListInt3 = new ArrayList<>();
        List<Integer> assListInt4 = new ArrayList<>();
        List<Integer> assListInt5 = new ArrayList<>();
        List<Integer> assListInt6 = new ArrayList<>();
        List<Integer> assListInt7 = new ArrayList<>();
        List<Integer> assListInt8 = new ArrayList<>();
        List<Integer> assListInt9 = new ArrayList<>();

        List<Double> assListDouble1 = new ArrayList<>();
        List<Double> assListDouble2 = new ArrayList<>();
        List<Double> assListDouble3 = new ArrayList<>();
        List<Double> assListDouble4 = new ArrayList<>();
        List<Double> assListDouble5 = new ArrayList<>();
        List<Double> assListDouble6 = new ArrayList<>();
        List<Double> assListDouble7 = new ArrayList<>();
        List<Double> assListDouble8 = new ArrayList<>();
        List<Double> assListDouble9 = new ArrayList<>();

        for (int i=0; i<10; i++) {
            Random rnd = new Random();
            int tempInt = 2 + rnd.nextInt(6);
            double tempDouble = 2.0 + (5.0 - 2.0) * rnd.nextDouble();

            assListInt1.add(tempInt);
            assListInt2.add(tempInt);
            assListInt3.add(tempInt);
            assListInt4.add(tempInt);
            assListInt5.add(tempInt);
            assListInt6.add(tempInt);
            assListInt7.add(tempInt);
            assListInt8.add(tempInt);
            assListInt9.add(tempInt);

            assListDouble1.add(tempDouble);
            assListDouble2.add(tempDouble);
            assListDouble3.add(tempDouble);
            assListDouble4.add(tempDouble);
            assListDouble5.add(tempDouble);
            assListDouble6.add(tempDouble);
            assListDouble7.add(tempDouble);
            assListDouble8.add(tempDouble);
            assListDouble9.add(tempDouble);
        }

        List<Subject> students = new ArrayList<>();

        students.add(new Subject<Integer>("Алгебра", st1, assListInt1));
        students.add(new Subject<Integer>("Алгебра", st2, assListInt2));
        students.add(new Subject<Integer>("Алгебра", st3, assListInt3));
        students.add(new Subject<Integer>("Алгебра", st4, assListInt4));
        students.add(new Subject<Integer>("Алгебра", st5, assListInt5));
        students.add(new Subject<Integer>("Алгебра", st6, assListInt6));
        students.add(new Subject<Integer>("Алгебра", st7, assListInt7));
        students.add(new Subject<Integer>("Алгебра", st8, assListInt8));
        students.add(new Subject<Integer>("Алгебра", st9, assListInt9));

        students.add(new Subject<Double>("Физкультура", st1, assListDouble1));
        students.add(new Subject<Double>("Физкультура", st2, assListDouble2));
        students.add(new Subject<Double>("Физкультура", st3, assListDouble3));
        students.add(new Subject<Double>("Физкультура", st4, assListDouble4));
        students.add(new Subject<Double>("Физкультура", st5, assListDouble5));
        students.add(new Subject<Double>("Физкультура", st6, assListDouble6));
        students.add(new Subject<Double>("Физкультура", st7, assListDouble7));
        students.add(new Subject<Double>("Физкультура", st8, assListDouble8));
        students.add(new Subject<Double>("Физкультура", st9, assListDouble9));

        searcher(students, "Рузвельт Мира");
    }

    public static void searcher(List<Subject> list, String name) {

    }
}
