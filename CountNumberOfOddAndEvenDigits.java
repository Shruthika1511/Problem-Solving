package PackageProblems;

import java.util.Scanner;

public class CountNumberOfOddAndEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count1=0,count2=0;
        while(n!=0)
        {
            int rem=n%10;
            if(rem%2==0)
            {
                count1++;
            }
            else
            {
                count2++;
            }
            n/=10;
        }
        System.out.println("ODD"+" "+count2);
        System.out.println("EVEN"+" "+count1);
	}

}
