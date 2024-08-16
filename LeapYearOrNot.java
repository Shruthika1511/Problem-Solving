package PackageProblems;

import java.util.*;
public class LeapYearOrNot{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        int flag=(year%400==0)||(year%4==0 && year%100!=0)?1:0;
        String l=flag!=1?"No":"Yes";
        System.out.println(l);
    }
}