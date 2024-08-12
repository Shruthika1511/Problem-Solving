package Programs;
import java.util.Scanner;
public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fact(n));
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}

	}
