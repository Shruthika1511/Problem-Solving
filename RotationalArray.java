package Programs;
import java.util.*;
public class RotationalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int r=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<=r;i++)
		{
			int temp=a[0];
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	}

}
