package Unit2.Task5;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    private Subjects subject;
    private List<T> assessments = new ArrayList<>();
    Student student;

    public Subject(Subjects subject, String studentName) {
        this.subject = subject;
        student = new Student(studentName);
    }

    public Subject(Subjects subject, String studentName, List<T> assessments) {
        this(subject, studentName);
        setAssessments(assessments);
    }

    public void setAssessments(List<T> assessments) {
        this.assessments = assessments;
    }

    public void addAssessments(T ass) {
        assessments.add(ass);
    }
}

enum Subjects {
    Math,
    Informatics,
    History
}
