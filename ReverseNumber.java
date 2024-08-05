public class ReverseNumber {
    public static void main(String[] args)
    {
        int n=2003;
        getNumber(n);

    }
    public static void getNumber(int n)
    {
        if(n==0)
            return;
        int rem = n % 10;
        System.out.print (rem);

        getNumber (n / 10);
    }
}
