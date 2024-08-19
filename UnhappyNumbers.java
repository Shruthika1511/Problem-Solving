package PackageProblems;
import java.util.*;
public class UnhappyNumbers {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt(),n2=s.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            int num=i,slow=num,fast=num;
            boolean isHappy=false;
            while(true)
            {
                slow=getNext(slow);
                fast=getNext(getNext(fast));
                if(fast==1)
                {
                    isHappy=true;
                    break;
                }   
                if(slow==fast)
                {
                    break;
                }
            }
            if(!isHappy)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static int getNext(int n)
    {
        int sum=0;
        while(n>0)
        {
            int didi=n%10;
            sum+=didi*didi;
            n/=10;
        }
        return sum;
    }
}