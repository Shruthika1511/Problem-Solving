package PackageProblems;
import java.util.*;
public class PalindromeOrNot{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int temp=n;
    int rev=0,rem=0;
    while(n!=0)
    {
        rem=n%10;
        rev=rev*10+rem;
        n/=10;
    }
    String l=(rev==temp)?"Yes":"No";
    System.out.print(l);
}
}
