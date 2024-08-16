package PackageProblems;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        int deci=0;
        int len=s1.length();
        for(int i=0;i<len;i++)
        {
            char ch=s1.charAt(len-1-i);
            int digit=Character.getNumericValue(ch);
            if(digit>=0 && digit<=7)
            {
                deci+=digit*Math.pow(8,i);
            }
        }
        System.out.println(deci);
    }
}
