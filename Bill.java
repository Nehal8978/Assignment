import java.util.Scanner;
class Bill
{
   int billno;
   String description;
   double sales_amount;
   double discount,amt_afterdiscount;
   
   public void read()
   {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter billno");
      billno = sc.nextInt();
      System.out.println("enter description ");
      description = sc.next();
      System.out.println("enter sales amount");
      sales_amount=sc.nextDouble();
      
      
    }
    
    void calculateBill()
    {
     if(sales_amount>50000)
     {
       discount =0.1;
     }
      else{
         discount = 0.02;
       }
    
      amt_afterdiscount = sales_amount -(sales_amount*discount);
     }

    public void show()
    {
        System.out.println("enter billno"+billno);
        System.out.println("enter secription"+description);
        System.out.println("enter sales_amount"+sales_amount);
        System.out.println("enter discount"+(discount*100)+"%");
        System.out.println("enter after discount"+amt_afterdiscount);
        
     
    }
    

     public static void main(String [] args)
              {
                Bill bill1= new Bill();
                bill1.read();
                bill1.calculateBill();
                bill1.show();

                Bill bill2 = new Bill();
                bill2.read();
                bill2.calculateBill();
                bill2.show();
              }
}
