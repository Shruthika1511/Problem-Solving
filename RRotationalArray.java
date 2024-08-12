package Programs;

import java.util.Scanner;

public class RRotationalArray {

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
			int temp=a[n-1];
			for(int j=n-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		

	}

}
