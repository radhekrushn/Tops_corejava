package array;

public class ArrayOpration {


	public static void main(String[] args) {
  
		int a[] = {1,2,3,4,5,6,7,8};
		int num = 0;
		for(int i=0;i<a.length;i++)
		{
			num = num +a[i];
		}
		  System.out.println("num : "+num); 
		  System.out.println("avg : "+(num/a.length));
		
		/*int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min =a[i];
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		 
		*/
		

	}

}
