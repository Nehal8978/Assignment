

import java.util.Scanner;
public class Student 
{
	
	//attributes or data members or class variables
	
	     private int idno;
	     private String name, course;
	     private float avg_marks;

          

	   
           public void read()
           {

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter Student id");
             idno=sc.nextInt();
             System.out.println("Enter Student name"); 
             name=sc.next();
             System.out.println("Enter Student course"); 
             course=sc.next();
             System.out.println("Enter Student average marks");
             avg_marks=sc.nextFloat();                       
             sc.close();

           }

              public void showdata()
	     {
		System.out.println("IDNO :"+ idno);
		System.out.println("Name :"+ name);
		System.out.println("Course :"+ course);
		
		
		if(avg_marks>=60)
			System.out.println("Grade A+");
		else
			System.out.println("Grade A");
                
	      }
          
              public static void main(String [] args)
              {
                Student std1= new Student();
                std1.read();
                std1.showdata();
              }
}


