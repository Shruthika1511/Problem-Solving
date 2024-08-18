package PackageProblems;

import java.util.Scanner;

public class SpiralPattern {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int si=2*n-1;
        int[][] m=new int[si][si];
        for(int k=0;k<n;k++)
        {
            int val=n-k;
            for(int i=k;i<si-k;i++)
            {
                m[k][i]=val;
                m[si-k-1][i]=val;
                m[i][k]=val;
                m[i][si-k-1]=val;
            }
        }
        for(int[] r:m)
        {
            for(int c:r)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

}
