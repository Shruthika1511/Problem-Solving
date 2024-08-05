public class PalindromeNumber {
    public static void main(String[] args)
    {
        int num=1241;
        int rev=0;
        getPalindrome(num,rev);
        if (getPalindrome(num,rev)== num) {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }
    }
    public static int getPalindrome(int num,int rev)
    {
        if(num==0)
            return rev;
        int rem=num%10;
        rev=rev*10+rem;
        return getPalindrome(num/10,rev);
    }

}
