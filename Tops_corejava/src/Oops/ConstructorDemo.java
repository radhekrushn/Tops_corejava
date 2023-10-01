package Oops;

class employee
{
	int emp_id;
	String emp_name;
	double sal;
	
	employee()  // class name must be constructor name 
	{
		System.out.println("constructor call");
	}
	employee(int id)
	{
		System.out.println("ID is : "+id);
	}
	employee(String name)
	{
		System.out.println("Name is : "+name);
	}
	employee(double sal)
	{
		System.out.println("salary is : "+sal);
	}
	employee(int a, String b, double c)
	{
		emp_id = a;
		emp_name = b;
		sal = c;
	}
	
	public void showing()
	{
		System.out.println(emp_id+" "+emp_name+" "+sal);
	}
}



public class ConstructorDemo {
	public static void main(String[] args) {
		
		employee e = new employee();
		employee e1 = new employee(12345);
		employee e2 = new employee("Hinal");
		employee e3 = new employee(22.33);
		
		employee cons = new employee(9876,"Tops",78.33);
		cons.showing();
      

	}

}
