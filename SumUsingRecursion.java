package Programs;
import java.util.*;
public class SumUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sum(n));
	}
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+sum(n-1);
		}
	}

}
