package PackageProblems;
import java.util.*;
public class CountSetBits {
	    public static void main(String[] args)
	    { //ip=7 op=3
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int count=0;
	        while(n>0)
	        {
	            count+=(n&1);
	            n>>=1;
	        }
	        System.out.print(count);
	    }
	}