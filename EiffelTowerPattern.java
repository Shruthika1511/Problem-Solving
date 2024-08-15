package PackageProblems;

import java.util.*;
public class EiffelTowerPattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            //int l=i;
            for(int j=0;j<n-i+1;j++)
            {
                for(int k=0;k<i+(i-1);k++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}