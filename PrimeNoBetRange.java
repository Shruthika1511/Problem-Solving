package PackageProblems;

import java.util.*;
public class PrimeNoBetRange
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        for(int i=a;i<b;i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}