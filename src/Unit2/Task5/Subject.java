package Unit2.Task5;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    private Student student;
    private String subject;
    private List<T> assessments = new ArrayList<>();

    public Subject(String subject, Student student, List<T> assessments) {
        this.student = student;
        this.subject = subject;
        setAssessments(assessments);
    }

    public void setAssessments(List<T> assessments) {
        this.assessments = assessments;
    }

    public List<T> getAssessments() {
        return assessments;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }
}
