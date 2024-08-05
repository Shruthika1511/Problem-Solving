public class PrimeWithInRange {
    public static void main(String[] args)
    {
        int n1=2,n2=20;
        for(int i=n1;i<=n2;i++)
        {
            if(checkPrime(i))
                System.out.println(i);
        }
    }
    public static boolean checkPrime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
