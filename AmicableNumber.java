package PackageProblems;
import java.util.Scanner;
public class AmicableNumber {
	 public static void main(String[] args)
	    { //ip=220 284 op=Yes
	        Scanner s=new Scanner(System.in);
	        int n1=s.nextInt();
	        int n2=s.nextInt();
	        int sum1=0,sum2=0;
	        for(int i=1;i<=n1/2;i++)
	        {
	            if(n1%i==0)
	            {
	                sum1+=i;
	            }
	        }
	        for(int i=1;i<=n2/2;i++)
	        {
	            if(n2%i==0)
	            {
	                sum2+=i;
	            }
	        }
	        if(sum1==n2 && sum2==n1)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
}
