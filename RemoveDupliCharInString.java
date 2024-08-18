package PackageProblems;

import java.util.*;
public class RemoveDupliCharInString
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] ch=s1.toCharArray();
        int n=ch.length;
        String result="";
        for(int i=0;i<n;i++)
        {
            boolean isDupli=false;
            for(int j=0;j<i;j++)
            {
                if(ch[i]==ch[j])
                {
                    isDupli=true;
                    break;
                }
            }
        if(!isDupli)
        {
            result+=ch[i];
        }
        }
        System.out.println(result);
    }
}