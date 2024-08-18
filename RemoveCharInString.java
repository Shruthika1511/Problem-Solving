package PackageProblems;

import java.util.*;
public class RemoveCharInString
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        char ch=s.next().charAt(0);
        String res="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=ch)
            {
                res=res+s1.charAt(i);
            }
        }
        System.out.println(res);
    }
}