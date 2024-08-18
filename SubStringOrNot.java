package PackageProblems;

import java.util.*;
public class SubStringOrNot
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        String s2=new String(s.nextLine());
        int l=s1.length();
        int m=s2.length();
        int result=-1;
        for(int i=0;i<l-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(s1.charAt(i+j)!=s2.charAt(j))
                {
                    break;
                }
            }
            if(j==m)
            {
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}