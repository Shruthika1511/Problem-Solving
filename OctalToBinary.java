package PackageProblems;

import java.util.Scanner;

public class OctalToBinary {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.next());
        int deci=0;
        for(int i=0;i<s1.length();i++)
        {
            deci=deci*8+(s1.charAt(i)-'0');
        }
        String bin="";
        while(deci>0)
        {
            bin=(deci%2)+bin;
            deci/=2;
        }
        System.out.println((bin.isEmpty()?"0":bin));
    }

}
