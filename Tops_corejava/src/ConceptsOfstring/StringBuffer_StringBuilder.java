package ConceptsOfstring;

public class StringBuffer_StringBuilder {	
	public static void main(String[] args) {
		
	  
	 double Starttime = System.currentTimeMillis();
	 StringBuffer sb = new StringBuffer("Hello");
	 for(int i = 1; i<1000000;i++)
	 {
		 sb.append("java");
	 }
	 double endtime = System.currentTimeMillis();
	 
		
	 double Starttime1 = System.currentTimeMillis();
	 StringBuilder sb1 = new StringBuilder("Hey");
	 for(int i = 1;i<1000000;i++)
	 {
		 sb1.append("java");
	 }
	 double endtime1 = System.currentTimeMillis();	
		
		
     System.out.println("Time taken by buffer : "+(endtime-Starttime));		
     System.out.println("Time taken by builder : "+(endtime1-Starttime1));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
