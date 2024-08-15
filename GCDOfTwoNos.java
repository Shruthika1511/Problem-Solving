package PackageProblems;
import java.util.*;
public class GCDOfTwoNos {
	public static void main(String[] args)
	    {//ip=12 20 op=4
	        Scanner s=new Scanner(System.in);
	        int n1=s.nextInt(),n2=s.nextInt();
	        while(n2!=0)
	        {
	            int temp=n2;
	            n2=n1%n2;
	            n1=temp;
	        }
	        System.out.println(n1);
	    }
	}
