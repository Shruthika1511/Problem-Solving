package PackageProblems;

import java.util.*;
public class CharacterMultiplier
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='0' && ch[i]<='9')
            {
                int k=0;
                int p=i;
                while(i<ch.length && ch[i]>='0' && ch[i]<='9')
                {
                    k=k*10+(ch[i]-'0');
                    i++;
                }
                char ch1=ch[p-1];
                for(int j=0;j<k;j++)
                {
                    System.out.print(ch1);
                }
                i--;
            }
        }
    }
}