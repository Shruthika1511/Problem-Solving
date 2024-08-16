package PackageProblems;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int sq=n*n;
	        int temp=sq;
	        int sum=0;
	        while(temp>0)
	        {
	            sum+=temp%10;
	            temp/=10;
	        }
	        String l=(sum==n)?"Yes":"No";
	        System.out.println(l);
	    }

	}
