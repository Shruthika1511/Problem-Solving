package Programs;

public class DateValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int da=31;
		char ch=47;
		int mo=1;
		int year=2024;
		
		if((mo==1|| mo==3 || mo==5 ||mo==7 ||mo==8 || mo==10 || mo==12)&&(da>=1 && da<=31))
		{
			System.out.println("valid");
		}
		else if((mo==4|| mo==6 || mo==9 ||mo==11)&&(da>=1 && da<=30))
		{
			System.out.println("valid");
		}
		else if((mo==2)&&(da<=29 && da>=1)&&(year%400==0)||(year%4==0 && year%100!=0))
 		{
			System.out.println("valid");
 		}
		else if((mo==2)&&(da<=28 && da>=1))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
		