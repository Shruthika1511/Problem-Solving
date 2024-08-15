package PackageProblems;

import java.util.Scanner;

public class DecimalToHexaDecimal {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String m=Integer.toHexString(n).toUpperCase();
        System.out.print(m);
    }

}
