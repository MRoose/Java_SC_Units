package Task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        System.out.println(getQA(Locale.getDefault(), 1));
        System.out.println("////////////////////////////////////////");
        System.out.println(getQA(Locale.US, 5));
    }

    private static String getQA(Locale locale, Integer number) {
        ResourceBundle rbQuestions = ResourceBundle.getBundle("Task2.Questions", locale);
        ResourceBundle rbAnswers = ResourceBundle.getBundle("Task2.Answers", locale);
        return rbQuestions.getString("q"+number.toString()) + " - " + rbAnswers.getObject("a"+number.toString()).toString();
    }
}
