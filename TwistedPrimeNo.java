package PackageProblems;

import java.util.*;
public class TwistedPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String l=(isTwisted(n))?"Twisted Prime Number":"Not Twisted Prime Number";
        System.out.println(l);
    }
    public static boolean isTwisted(int n)
    {
        if(!isPrime(n))
        {
            return false;
        }
        int rev=reverse(n);
        return isPrime(rev);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return rev;
    }

	}
