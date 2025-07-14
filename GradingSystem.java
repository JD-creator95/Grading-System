import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents;

        System.out.print("Enter number of students: ");
        totalStudents = scanner.nextInt();

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter marks for student " + i + " (0-100, or -1 to exit): ");
            int marks = scanner.nextInt();

            // Break the loop if user enters -1
            if (marks == -1) {
                System.out.println("Early exit requested. Exiting program...");
                break;
            }

            // Continue if marks are invalid
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Must be between 0 and 100. Skipping to next student.");
                continue;
            }

            // Assigns the grade
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Print result
            System.out.println("Assigned Grade: " + grade);

            // Switch-case to describe the grade
            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Very Good!");
                    break;
                case 'C':
                    System.out.println("Good.");
                    break;
                case 'D':
                    System.out.println("Needs Improvement.");
                    break;
                case 'F':
                    System.out.println("Failed.");
                    break;
                default:
                    System.out.println("Unexpected grade.");
            }

            System.out.println(); // Adds space between students
        }

        scanner.close();        
    }
}
