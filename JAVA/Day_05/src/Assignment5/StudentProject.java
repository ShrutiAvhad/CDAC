package Assignment5;

import java.util.Scanner;

public class StudentProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of parent type
        Student arr[] = new Student[5];

        // Creating objects
        arr[0] = new CollegeStudent(1, 80.5, 5);
        arr[1] = new CollegeStudent(2, 70.0, 3);
        arr[2] = new SchoolStudent(3, 85.0, "12th");
        arr[3] = new SchoolStudent(4, 60.0, "10th");
        arr[4] = new SchoolStudent(5, 90.0, "9th");

        // Display all records
        System.out.println("=== All Students ===");
        for (Student s : arr) {
            s.show();
            System.out.println();
        }

        // Search by roll number
        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        boolean found = false;

        for (Student s : arr) {
            if (s.getRollNo() == searchRoll) {
                found = true;

                if (s instanceof CollegeStudent) {
                    System.out.println("This is a CollegeStudent");
                } else if (s instanceof SchoolStudent) {
                    System.out.println("This is a SchoolStudent");
                }

                s.show();
            }
        }

        if (!found) {
            System.out.println("Record not found");
        }

        // Count A grade students (>75)
        int count = 0;

        for (Student s : arr) {
            if (s.getPer() > 75) {
                count++;
            }
        }

        System.out.println("Number of A grade students: " + count);

        sc.close();
    }
}