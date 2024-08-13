package PackageProblems;
import java.util.*;
public class ArmsStrongNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int sum=0;
        int len=String.valueOf(n).length();
        while(n!=0)
        {
            int rem=n%10;
            int en=(int)Math.pow(rem,len);
            sum+=en;
            n/=10;
        }
        String l=(sum==temp)?"Yes":"No";
        System.out.print(l);

	}

}