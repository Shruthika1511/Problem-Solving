import java.util.Scanner;
public class AppendZerosLast {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int l = 0,in=0;
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            l=s.nextInt();
            if(l!=0)
            {
                arr[in]=l;
                in++;
            }
        }
        for(int j: arr)
        {
            System.out.print(j);
        }

    }
}
