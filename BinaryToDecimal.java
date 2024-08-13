package PackageProblems;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        int deci=0;
        int len=s1.length();
        for(int i=0;i<len;i++)
        {
            char ch=s1.charAt(len-1-i);
            if(ch=='1')
            {
                deci+=Math.pow(2,i);
            }
        }
        System.out.println(deci);
    }

}
