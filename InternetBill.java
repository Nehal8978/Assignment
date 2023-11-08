import java.util.Scanner;
public class InternetBill
{
   public static void main(String [] args)
   {
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the total data Consumed in GB");
     int data_consumed = sc.nextInt();
     
     if (data_consumed<10)
     {
        
        System.out.println("Bill Amount is 300 ");
     }
    
     else if(data_consumed>10 & data_consumed < 30)
     {
        int bill_amount = 300 + 5*(data_consumed - 10);
         
        System.out.println("  Bill amount is  " + bill_amount);
     }

     else 
     {  
        int bill_amount = 400 + 3*(data_consumed - 30 );

        System.out.println("  Bill amount is  "  + bill_amount); 

     }
     
   }
}