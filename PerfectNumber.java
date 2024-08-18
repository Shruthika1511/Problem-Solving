package PackageProblems;

import java.util.Scanner;

public class PerfectNumber {
	    public static void main(String[] args)
	    {//ip=6 op=Yes
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),sum=0;
	        for(int i=1;i<=n/2;i++)
	        {
	            if(n%i==0)
	            {
	                sum+=i;
	            }
	        }
	        String l=(sum==n)?"Yes":"No";
	        System.out.println(l);

	    }
	}
