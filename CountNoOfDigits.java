package PackageProblems;

import java.util.*;
public class CountNoOfDigits
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0,count=0;
        for(int i=n;i>0;count++,i=i/10);
        System.out.print(count);
    }
}