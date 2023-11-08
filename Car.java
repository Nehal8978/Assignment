public class Car
{
   
      private String make;
      private String name;
      private short  year;
      private int   price;

    public Car (String m , String n ,short y, int p)
    {
      
      make = m;
      name = n;
      year = y;
      price= p;
    }
   
     
     public void showdata()
	{
		System.out.println("Make "+ make);
		System.out.println("Name "+ name);
		System.out.println("year "+ year);
		System.out.println("price "+ price);
		
		
	}
      public static void main(String[] args) {

        short yr=2023;
        Car Car1 = new Car("zen", "Maruti", yr, 500000);
        Car1.showdata();

      }
  
}



	
