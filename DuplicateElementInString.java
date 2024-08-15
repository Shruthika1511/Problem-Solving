package PackageProblems;

import java.util.*;
public class DuplicateElementInString
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                char ch=s1.charAt(i);
                char ch1=s1.charAt(j);
                if(ch==ch1)
                {
                    System.out.print(ch+" ");
                }
            }
    }
}
}