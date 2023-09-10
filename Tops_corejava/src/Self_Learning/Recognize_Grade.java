package Self_Learning;

import java.util.Scanner;

public class Recognize_Grade {


	public static void main(String[] args) {
		System.out.println("\n<----you can display your grade according to your marks--->");
		Scanner sc = new Scanner(System.in);
	
		  
		    
	/*	int marks;
		
		
		System.out.println("Please, Enter your marks :");
		marks = sc.nextInt();
		
		if(marks < 100 && marks >= 90)
		{
			System.out.println("A Grade");
		}
		else if(marks < 90 && marks >= 70)
		{
			System.out.println("B Grade");
		}
		else if(marks < 70 && marks >= 50)
		{
			System.out.println("C Grade");
		}
		else if(marks < 50 && marks >= 35)
		{
			System.out.println("D Grade");
		}
		else if(marks < 35 && marks >= 0)
		{
			System.out.println("Fail!!!");
		}
		*/
		
		int Eco, BA, Statistics, Account, Total;
		float percentage;
		
		System.out.println("Enter your Eco marks :");
		Eco = sc.nextInt();
		System.out.println("Enter your BA marks :");
		BA = sc.nextInt();
		System.out.println("Enter your Statistics marks :");
		Statistics = sc.nextInt();
		System.out.println("Enter your Account marks :");
		Account = sc.nextInt();
		
		Total = (Eco+BA+Statistics+Account);
		percentage = ((float)Total/4);
		System.out.println("\nTotal marks (E+B+S+A) : "+Total);
		System.out.println("percentage : "+percentage);
		
		if(percentage < 100 && percentage >= 90)
		{
			System.out.println("A Grade");
		}
		else if(percentage < 90 && percentage >= 70)
		{
			System.out.println("B Grade");
		}
		else if(percentage < 70 && percentage >= 50)
		{
			System.out.println("C Grade");
		}
		else if(percentage < 50 && percentage >= 35)
		{
			System.out.println("D Grade");
		}
		else if(percentage < 35 && percentage >= 0)
		{
			System.out.println("Fail!!!");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
