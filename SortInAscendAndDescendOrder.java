package PackageProblems;

import java.util.*;

public class SortInAscendAndDescendOrder {
	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int num:a)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        int l=0,r=n-1;
        while(l<r)
        {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        for(int num: a)
        {
            System.out.print(num+" ");
        }
    }

}
