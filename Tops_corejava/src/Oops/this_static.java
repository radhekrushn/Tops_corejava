package Oops;

class enc
{
	 int id = 4;
	static String name; 
	
	public void data()
	{
		System.out.println(this.id+" "+name);
	}
}


public class this_static {

	public static void main(String[] args) {
	
		enc.name = "hina";
		enc e = new enc();
		e.data();
		
		
	
	}

}
