package ie.atu;

public class Student
{
    private String studentName;
    private String studentEmail;
    private String studentId;

    public Student(String stName, String stEmail, String stId)
    {
        this.studentName = stName;
        this.studentEmail = stEmail;
        this.studentId = stId;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}