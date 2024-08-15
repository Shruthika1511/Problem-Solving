package PackageProblems;

import java.util.*;
public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String l=Integer.toBinaryString(n);
        System.out.println(l);
    }
}