package PackageProblems;

import java.util.*;
public class DecimalToOctal
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String l=Integer.toOctalString(n);
        System.out.println(l);
    }
}