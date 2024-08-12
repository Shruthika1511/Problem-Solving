package Programs;

import java.util.*;

public class AppendMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt(),n2=s.nextInt();
		int [][]a=new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int sum=0,ans=0,c=0,max=0;
		for(int i=0;i<n1;i++)
		{
			ans=0;
			for(int j=0;j<n2;j++)
			{
				sum=a[i][j];
				c=(int)Math.log10(sum)+1;
				ans=ans*(int)Math.pow(10, c)+sum;
			}
			if(ans>max)
			{
				max=ans;
			}
		}
		System.out.println(ans);
	}

}
