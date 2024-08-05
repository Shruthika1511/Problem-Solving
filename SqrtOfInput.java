import java.util.*;
public class SqrtOfInput {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        /* Method1 int m=n,sum=0,b=0;
        int[] a={0,1,4,9,16,25,36,49,64,81,100};
        for(int i=a.length-1;i>=0;)
        {
            if(n<a[i])
            {
                i--;
            }
            else
            {
                while(n>=a[i])
                {
                    sum=sum*10+i;
                    b=b+a[i];
                    n=n-a[i];
                }
                if(b==m)
                {
                    break;
                }
            }
        }
        System.out.println(sum);*/
        /*  Method2 int root=0;
        while(n>0)
        {
            root=(int)Math.sqrt(n);
            System.out.print(root);
            n=n-(root*root);
        }*/
        for(int i=s.nextInt();i>0;System.out.print((int)Math.sqrt(i)),i=i-((int)Math.sqrt(i)*(int)Math.sqrt(i)));

    }
}
