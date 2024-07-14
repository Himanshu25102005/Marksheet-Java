import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter roll number:");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter marks for subject 1:");
        int subject1 = scanner.nextInt();

        System.out.println("Enter marks for subject 2:");
        int subject2 = scanner.nextInt();

        System.out.println("Enter marks for subject 3:");
        int subject3 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (double) totalMarks / 3;
        String grade = calculateGrade(percentage);

        System.out.println("\n---------------- Marksheet ----------------");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("-------------------------------------------");
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("-------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------------------------");

        scanner.close();
    }

    private static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
