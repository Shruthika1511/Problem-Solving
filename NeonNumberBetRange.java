package PackageProblems;

import java.util.Scanner;

public class NeonNumberBetRange { 
	public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int m=s.nextInt(),n=s.nextInt();
    for(int i=m;i<=n;i++)
    {
        int sq=i*i;
        int sum=0;
        while(sq>0)
        {
            int rem=sq%10;
            sum+=rem;
            sq/=10;
        }
        if(sum==i)
        {
            System.out.print(i+" ");
        }
    }
}
}
