package StudentList;

public class Student {
    private String name;
    private String surname;
    private String studentNumber;

    public Student(String name, String surname, String studentNumber) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
}
