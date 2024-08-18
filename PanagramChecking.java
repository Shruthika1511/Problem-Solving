package PackageProblems;
import java.util.*;
public class PanagramChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s=new Scanner(System.in);
		        String s1=new String(s.nextLine());
		        int[] a=new int[26];
		        for(int i=0;i<s1.length();i++)
		        {
		            if(s1.charAt(i)<='Z' && s1.charAt(i)>='A')
		            {
		                a[s1.charAt(i)-'A']++;
		            }
		            else if(s1.charAt(i)<='z' && s1.charAt(i)>='a')
		            {
		                a[s1.charAt(i)-'a']++;
		            }
		        }
		        int f=0;
		        for(int i=0;i<26;i++)
		        {
		            if(a[i]==0)
		            {
		                f=1;
		                break;
		            }
		        }
		        if(f==0)
		        {
		            System.out.print("TRUE");
		        }
		        else{
		            System.out.print("FALSE");
		        }
		        /*s1=s1.toLowerCase();
		        java.util.HashSet<Character> letters=new java.util.HashSet<>();
		        for(char c:s1.toCharArray())
		        {
		            if(Character.isLetter(c))
		            {
		                letters.add(c);
		            }
		        }
		        String l=(letters.size()==26)?"TRUE":"FALSE";
		        System.out.println(l);*/

		    }
}
