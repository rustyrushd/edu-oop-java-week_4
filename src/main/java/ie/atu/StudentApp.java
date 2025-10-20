package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        int count = scan1.nextInt();
        scan1.nextLine();

        // prompt user for count number of students
        for (int i = 0; i < count; i++) {
            System.out.println("Please enter Student name: ");
            String name = scan1.nextLine();
            System.out.println("Please enter Student email");
            String email = scan1.nextLine();
            System.out.println("Please enter Student ID");
            String id = scan1.nextLine();
            Student student1 = new Student(name, email, id);
            studentList.add(student1);
        }

        scan1.close();

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}