package PackageProblems;

import java.util.*;
public class LargestPrimeFactor
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(large(n));
    }
    public static int large(int n)
    {
        int lar=-1;
        while(n%2==0)
        {
            lar=2;
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            while(n%i==0)
            {
                lar=i;
                n/=i;
            }
        }
        if(n>2)
        {
            lar=n;
        }
        return lar;
    }
}