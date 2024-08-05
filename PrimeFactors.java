import java.util.*;
public class PrimeFactors {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n%2==0)
        {
            System.out.print("2");
            n=n/2;
        }
        for(int i=3;i*i<=n;i=i+2)
        {
            while(n%i==0)
            {
                System.out.print(i);
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.print(n);
        }
    }


}
