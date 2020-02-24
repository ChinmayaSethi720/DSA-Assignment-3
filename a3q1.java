import java.util.*;
public class a3q1
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
           
            
            try 
            {
            	System.out.println("Enter the number");
            	 int i=sc.nextInt();
            	 if(i<0) {
            		 throw new NumberFormatException("Number is negative");
            		 
            	 }
            	 else
            	 {
            		 System.out.println("number is positive");
            	 }
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }
          
	}

}