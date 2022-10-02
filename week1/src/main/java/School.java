import java.util.HashSet;
import java.util.HashMap;

public class School {

    //fields
    private String name;
    private HashSet<Student> students;

    //constructor
    public School(String name)
    {
        this.name = name;
        this.students = new HashSet();
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

    public HashSet<Student> getStudents()
    {
        return this.students;
    }

    public void addStudents(Student student)
    {
        this.students.add(student);
    }

    //methods

    public HashMap getResultsFromStudent(String name)
    {
        for (Student student : students)
        {
            if (student.getName().equals(name))
            {
                return student.getGrades();
            }
        }
        return null;
    }

    public void getInsufficientStudents(String subject) {
        for (Student student : students) {
            if (student.getGrades().containsKey(subject)) {
                if (student.getGrades().get(subject) < 5.5) {
                    System.out.println(student.getName() + " has an insufficient grade on " + subject);
                }
            } else {
                System.out.println("No students found with a grade on this subject.");
                break;
            }
        }
    }
}
