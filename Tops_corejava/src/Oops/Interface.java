package Oops;

interface inter1
  {
	int a = 10;
	
	public double display();

  }


interface inter2
  {
	String s = "for understanding";
	
	public double display();
  } 

class kuch implements inter1, inter2 // here i try to write hinal instead of kuch
{                                    // but system not allow me 
	@Override
	public double display() {
		
		System.out.println("running display here");
		System.out.println("inter 1 : "+a);
		System.out.println("inter 2 : "+s);
		// TODO Auto-generated method stub
		return 0;
	}
}




public class Interface {
	public static void main(String[] args) {
		
		kuch h = new kuch();
		h.display();
		
		
			
	}

}
