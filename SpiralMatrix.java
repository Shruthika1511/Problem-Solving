package Programs;
import java.util.*;
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt(),c=s.nextInt(),top=0,bottom=r-1,left=0,right=c-1;
		int [][]a=new int[r][c];
		while(top<=bottom && left<=right)
		{
			for(int i=left;i<=right;i++)
			{
				a[top][i]=s.nextInt();
			}
			top++;
			for(int j=top;j<=bottom;j++)
			{
				a[j][right]=s.nextInt();
			}
			right--;
			for(int k=right;k>=left;k--)
			{
				a[bottom][k]=s.nextInt();
			}
			bottom--;
			if(left<=right)
			{
			for(int m=bottom;m>=top;m--)
			{
				a[m][left]=s.nextInt();
			}
			left++;
			}
		}
		for(int []i:a)
		{
			for(int k:i)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
	}

}
