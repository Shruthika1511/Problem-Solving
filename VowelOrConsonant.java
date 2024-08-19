package PackageProblems;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        char[] c={'a','e','i','o','u'};
        int flag=0;
        ch=Character.toLowerCase(ch);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==ch)
            {
                flag=1;
                break;
            }
        }
        String l=(flag==1)?"VOWEL":"CONSONANT";
        System.out.println(l);
        
	}

}
