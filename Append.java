import java.util.*;
public class Append {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int reverse=0;//123456  214365
        for(int i=n;i>0;reverse=reverse*10+(i%10),i=i/10);
        for(int i=reverse;i>0;System.out.print(i%100),i=i/100);
    }
}
