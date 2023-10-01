package Oops;

class  Student_Record
{
 
	int ID;
	int RollNo;
	int standard;
	String StudentName;
	String FacultyName;
	
	public void display()
	{
		  System.out.println("student's id: "+ID);
		  System.out.println("student's Roll Number: "+RollNo);
		  System.out.println("student's standard: "+standard);
		  System.out.println("student's name: "+StudentName);
		  System.out.println("stdent's faculty name: "+FacultyName);
	}
		
}



public class Student {

	public static void main(String[] args) {
		
		Student_Record S1 = new Student_Record();
		S1.ID = 12345;
		S1.RollNo = 7;
		S1.standard = 10;
		S1.StudentName = "Mahek";
		S1.FacultyName = "Harshad Hapani";
		S1.display();
		
				
		
		
	
	}

}
