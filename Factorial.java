package PackageProblems;

import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.print(fact);
    }
}