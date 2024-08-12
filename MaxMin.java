package Programs;
import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=0,min=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[j];
				}
			}
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}
