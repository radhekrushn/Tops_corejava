package Self_Learning;

public class Username_email_password_5User {


	public static void main(String[] args) {
		
		String a[][] = { {"username1","password1","Email ID1"},
				         {"username2","password2","Email ID2"},
				         {"username3","password3","Email ID3"},
				         {"username4","password4","Email ID4"},
				         {"username5","password5","Email ID5"},};
		
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		}     
		

	}


