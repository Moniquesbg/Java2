import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    //fields
    private String name;
    private int studentNumber;
    private int year;
    private int month;
    private int day;
    private HashMap<Subject, Double> subjects;

    //constructor
    public Student(String name, int studentNumber, int year, int month, int day)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.year = year;
        this.month = month;
        this.day = day;
        this.subjects = new HashMap<>();
    }

    //getters and setters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber()
    {
        return this.studentNumber;
    }

    public LocalDate getDateOfBirth()
    {
        LocalDate birthday = LocalDate.of(this.year, this.month, this.day);
        return birthday;
    }

    public void setDateOfBirth(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //methods
    public void addSubjectAndGrade(Subject subject, Double grade)
    {
        this.subjects.put(subject, grade);
    }

    public HashMap<Subject, Double> getGrades()
    {
        return this.subjects;
    }
}
