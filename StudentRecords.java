import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        String[] rollno = new String[10];
        String[] name = new String[10];
        double[] averageMarks = new double[10];

        // Input student data
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollno[i] = scanner.nextLine();

            System.out.print("Enter name for student " + (i + 1) + ": ");
            name[i] = scanner.nextLine();

            System.out.print("Enter average marks for student " + (i + 1) + ": ");
            averageMarks[i] = Double.parseDouble(scanner.nextLine());
        }

        // Display all records
        System.out.println("\nAll Student Records:");
        System.out.println("Roll No\tName\tAverage Marks");
        for (int i = 0; i < 10; i++) {
            System.out.println(rollno[i] + "\t" + name[i] + "\t" + averageMarks[i]);
        }

        // Display students with average marks above 60
        System.out.println("\nStudents with Average Marks above 60:");
        System.out.println("Roll No\tName\tAverage Marks");
        for (int i = 0; i < 10; i++) {
            if (averageMarks[i] > 60) {
                System.out.println(rollno[i] + "\t" + name[i] + "\t" + averageMarks[i]);
            }
        }
    }
}