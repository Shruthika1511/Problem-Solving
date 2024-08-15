package PackageProblems;
import java.util.*;
public class DisariumNumber {
	    public static void main(String[] args)
	    { //ip=175 op=Yes
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),sum=0,temp=n;
	        int len=String.valueOf(n).length();
	        while(temp>0)
	        {
	            int rem=temp%10;
	            sum+=Math.pow(rem,len);
	            temp/=10;
	            len--;
	        }
	        String l=(sum==n)?"Yes":"No";
	        System.out.println(l);
	    }
	}
