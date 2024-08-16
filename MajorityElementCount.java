package PackageProblems;

import java.util.*;
public class MajorityElementCount
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        char[] c=s1.toCharArray();
        int[] fre=new int[256];
        int max=0;
        char ch=c[0];
        for(int i=0;i<c.length;i++)
        {
            fre[c[i]]++;
        }
        for(int i=0;i<c.length;i++)
        {
            if(fre[c[i]]>max)
            {
                max=fre[c[i]];
                ch=c[i];
            }
        }
        System.out.println(ch);
    }
}