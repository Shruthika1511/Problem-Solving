package Programs;
import java.util.*;
public class OddEvenWithinN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=(2*i)-(1+(int)Math.sqrt(8*i-7))/2;
			System.out.print(k+" ");
		}

	}

}
