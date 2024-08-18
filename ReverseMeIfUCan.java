package PackageProblems;

import java.util.Scanner;

public class ReverseMeIfUCan {

	public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=new String(s.nextLine());
        char[] c=s1.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            while (i < j && !(Character.isLetter(c[i]))) {
                i++;
            }
            while (i < j && !(Character.isLetter(c[j]))) {
                j--;
            }
            if (i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(String.valueOf(c));
    }
}
