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
        System.out.println("Please enter Student name: ");
        String name = scan1.nextLine();
        System.out.println("Please enter Student email");
        String email = scan1.nextLine();
        System.out.println("Please enter Student ID");
        String id = scan1.nextLine();
        scan1.close();

        Student student1 = new Student(name, email, id);
        studentList.add(student1);
        System.out.println(student1);
        System.out.println(studentList);
    }
}
