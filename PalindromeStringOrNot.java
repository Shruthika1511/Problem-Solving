package PackageProblems;

import java.util.*;
public class PalindromeStringOrNot
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        String rev=new StringBuilder(s1).reverse().toString();
        String l=(s1.equals(rev))?"Yes":"No";
        System.out.println(l);
        
    }
}
