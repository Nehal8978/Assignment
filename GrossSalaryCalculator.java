import java.util.Scanner;

public class GrossSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter basic salary: ");
            double basicSalary = scanner.nextDouble();

            double hra, da;

            if (basicSalary > 15000) {
                hra = 0.2 * basicSalary;
                da = 0.6 * basicSalary;
            } else {
                hra = 3000;
                da = 0.7 * basicSalary;
            }

            double grossSalary = basicSalary + hra + da;
            System.out.println("Gross Salary: " + grossSalary);

            System.out.print("Enter -1 to exit, any other number to continue: ");
            choice = scanner.nextInt();
        } while (choice != -1);

        scanner.close();
    }
}