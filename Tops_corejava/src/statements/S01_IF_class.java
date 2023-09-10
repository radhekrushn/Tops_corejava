package statements;

import java.util.Scanner;

public class S01_IF_class {



	public static void main(String[] args) {
		 
		/*int age = 8;
		
		if(age>18)
		{
			System.out.println("yor can give voting");
		}
		else
		{
			System.out.println("your age is invalid");
		}
		*/
		 Scanner scan = new Scanner(System.in);
		 int age;
		 System.out.println("Please enter your age: ");
		
		age = scan.nextInt();
		  
		   
		    // Checking condition for voting..
		    if(age>=18)
		    {
		        System.out.println("You are eligible for voting.");
		    }
		    else
		    {
		    	System.out.println("your age is invalid");
		    }
		
		
		
		
			
	
	}

}
