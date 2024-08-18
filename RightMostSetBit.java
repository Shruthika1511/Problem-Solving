package PackageProblems;
import java.util.*;
public class RightMostSetBit {
	 public static void main(String[] args)
	    {//ip=10 op=8
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int m;
	        if(n!=0)
	        {
	           m=n&(n-1);
	           System.out.println(m);
	        }
	    }
}
