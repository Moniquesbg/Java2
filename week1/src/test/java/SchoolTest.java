import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    private School nhlStenden;
    private Student student1;
    private Student student2;
    private Subject java;
    private Subject php;
    private HashMap<Subject, Double> testGrades = new HashMap<>();

    @BeforeEach
    void setUp() {
        nhlStenden = new School("nhlStenden");
        student1 = new Student("Monique Sabong", 500742, 2002, 10, 22);
        student2 = new Student("Henry Jansen", 500725, 2002,05,23);
        java = new Subject("java");
        php = new Subject("php");

        //adding students to nhlstenden
        nhlStenden.addStudents(student1);
        nhlStenden.addStudents(student2);

        //setting grades
        student1.addSubjectAndGrade(java, 7.0);
        student1.addSubjectAndGrade(php, 4.3);

        student2.addSubjectAndGrade(java, 7.0);
        student2.addSubjectAndGrade(php, 3.0);
    }

    @Test
    void getResultsFromStudent()
    {
        this.testGrades.put(java, 7.0);
        this.testGrades.put(php, 5.8);

        assertEquals(this.testGrades, nhlStenden.getResultsFromStudent("Monique Sabong"), "Grade list is not the same");
    }

    @Test
    void getInsufficientStudents() {
        nhlStenden.getInsufficientStudents("php");
    }
}