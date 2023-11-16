//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.


import java.util.Scanner;

public class AddNumbersLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            // Ask the user to enter two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate and display the sum
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            // Ask the user if they want to perform the operation again
            System.out.print("Do you want to perform the operation again? (yes/no): ");
            response = scanner.next();

            // Check if the response is "no" to terminate the loop
        } while (response.equals("yes") || response.equals("Yes") || response.equals("YES"));

        // Close the scanner after the loop
        scanner.close();
    }
}