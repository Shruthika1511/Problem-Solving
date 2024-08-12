package Programs;
import java.util.*;
public class LargestSumofMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt(),n2=s.nextInt(),max1=0;
		int [][]a=new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
	for(int i=0;i<n1;i++)
	{
		int sum=0;
		for(int j=0;j<a[i].length;j++)
		{
			sum+=a[i][j];
		}
		if(sum>max1)
		{
			max1=sum;
		}
}
	System.out.println(max1);
	
}
}