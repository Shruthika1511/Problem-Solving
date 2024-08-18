package PackageProblems;

import java.util.*;
public class ProAndPerfectSquareOfTwoNos{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        int w=n*m;
        int sq=(int)Math.sqrt(w);
        String l=(sq*sq==w)?"Yes":"No";
        System.out.println(l);
    }
}
