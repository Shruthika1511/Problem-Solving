package PackageProblems;

import java.util.Scanner;

public class BinaryToOctal {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        int deci=Integer.parseInt(s1,2);
        String octal=Integer.toOctalString(deci);
        System.out.println(octal);
    }

}
