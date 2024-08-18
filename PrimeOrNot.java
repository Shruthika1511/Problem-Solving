package PackageProblems;

import java.util.*;
public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        /*if(n<=1)
        {
            System.out.println("No");
        }
        else if(n==2)
        {
            System.out.println("Yes");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            System.out.println("Yes");
        }*/
        if(isPrime(n))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}