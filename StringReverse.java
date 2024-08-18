package PackageProblems;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        String[] s3=s1.split(" ");
        String s2="";
        for(int i=0;i<s3.length;i++)
        {
            s2=s3[i]+" "+s2;
        }
        System.out.println(s2);
	}

}
