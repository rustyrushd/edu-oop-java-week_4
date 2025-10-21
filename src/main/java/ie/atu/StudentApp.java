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

        // prompt user for count number of students and attribute input
        for (int i = 0; i < count; i++) {
            System.out.println("Please enter Student name: ");
            String name = firstCap(scan1.nextLine());

            System.out.println("Please enter Student email: ");
            String email = scan1.nextLine().toLowerCase().trim();

            // check if email already exists and keep prompting until a unique email is entered
            for (int j = 0; j < studentList.size(); j++) {
                while (studentList.get(j).getEmail().equals(email)) {
                    System.out.println("That email is already in the system. Please enter another email:");
                    email = scan1.nextLine().toLowerCase().trim();
                    j = 0;
                }
            }

            System.out.println("Please enter Course: ");
            String course = firstCap(scan1.nextLine());
            Student student1 = new Student(name, email, course);

            studentList.add(student1);
        }

        scan1.close();

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // capitalizes the first letter in a String
    static String firstCap(String text)
    {
        char fLetter = Character.toUpperCase(text.charAt(0));
        String rest = text.substring(1);
        return fLetter +  rest;
    }
}