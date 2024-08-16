package PackageProblems;
import java.util.*;
public class MixedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),mid=n/2;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        /*for(int i=0;i<mid-1;i++)
        {
            for(int j=0;j<mid-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=mid;i<n-1;i++)
        {
            for(int j=mid;j<n-i+mid-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }*/
        Arrays.sort(arr);
        int start=mid;
        int end=n-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
	}

}
