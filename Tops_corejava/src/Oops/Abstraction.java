package Oops;

abstract class abs
  {
	public abstract int display();
	
	public void show()
	{
		System.out.println("Runing abstract method");
	}
	
  }

class abs1  // this is my coding
  {
	public int syso() {
		
		System.out.println("For understanding : we use allow in this 2 class ");
		// TODO Auto-generated method stub
        return 0;
	}
  } 
class hinal extends abs
  {
	 @Override
	public int display() {
		 
		 System.out.println("abs display running");
		// TODO Auto-generated method stub
		return 0;
	}
  }



public class Abstraction {
	public static void main(String[] args) {
		
		hinal h = new hinal();
		h.display();
		h.show();
		abs1 a = new abs1();
		a.syso();
		
		
		
	}

}
