package PackageProblems;

import java.util.*;
public class RightAngledInvertedPattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int st=2*(n-i)-1;
            for(int j=0;j<st;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            st-=2;
        }
    }
}