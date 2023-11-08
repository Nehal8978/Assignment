import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oddCount = 0;
        int evenCount = 0;
        
        while (true) {
            System.out.print("Enter a number  ");
            int userInput = scanner.nextInt();
            
            if (userInput == 0) {
                break;
            }
            
            if (userInput % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Total even numbers: " + evenCount);
        
        scanner.close();
    }
}