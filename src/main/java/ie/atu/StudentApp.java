package ie.atu;

import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter Student name: ");
        String name = scan1.nextLine();
        System.out.println("Please enter Student email");
        String email = scan1.nextLine();
        System.out.println("Please enter Student ID");
        String id = scan1.nextLine();

        Student student1 = new Student(name, email, id);
        System.out.println(student1);
    }
}
