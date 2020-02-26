package Unit2.Task5;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    private Subjects subject;
    private List<T> assessments = new ArrayList<>();

    public Subject(Subjects subject) {
        this.subject = subject;
    }

    public Subject(Subjects subject, List<T> assessments) {
        this(subject);
        setAssessments(assessments);
    }

    public void setAssessments(List<T> assessments) {
        this.assessments = assessments;
    }

    public void addAssessments(T ass) {
        assessments.add(ass);
    }
}
