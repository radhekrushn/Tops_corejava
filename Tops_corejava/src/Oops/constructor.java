package Oops;

class product
	{	
	
	
	 int id;
	 int price;
	 int quantity;
	 String name;
	 String company;
	 
  
    product(int a,int b,int c,String d,String e) // constructor
    {
    	id = a;
    	price = b;
    	quantity = c;
    	name = d;
    	company = e;
    			
    	
    }
    
    public void show()
    {
    	System.out.println(id+" "+price+" "+quantity+" "+name+" "+company);
    }
      

	}



public class constructor {
	
	public static void main(String[] args) {
		
		product pro = new product(10,200,23,"cellopen","Adani");
		pro.show();
		
				

	}

}
