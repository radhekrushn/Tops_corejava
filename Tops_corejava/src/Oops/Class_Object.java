package Oops;

class Unique
{
	static int price = 10;
	String company = "cello";
	static String color = "red";
	String turnover = "10,333.33 ";
	
	
	 public void method()
	 {
		 System.out.println(price+" "+color+" "+company+" "+turnover);
	 }
}

   


public class Class_Object {
	public static void main(String[] args) {
		
		Unique.price = 90;
		Unique.color = "Blue";
		Unique U = new Unique();
		U.method();
		
		


	}

}
