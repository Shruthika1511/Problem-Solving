package PackageProblems;

import java.util.Scanner;

public class OddNosInRange {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt(),n2=s.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
