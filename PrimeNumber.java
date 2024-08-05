public class PrimeNumber {
    public static void main(String[] args)
    {
        int n=23;
        checkPrime(n);
    }
    /*static void checkPrime(int n)
    {
        {
            int flag = 0;
            // negative numbers, 0 and 1 are not prime
            if (n < 2)
            {
                System.out.println ("The given is number " + n + " is not prime");
                System.exit (0);
            }
            // checking the number of divisors b/w [1, n]
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                    flag += 1;
            }

            // if count of divisors greater than 2 then its not prime
            if (flag > 2)
                System.out.println ("The given is number " + n + " is not prime");

            else
                System.out.println ("The given is number " + n + " is prime");
        }*/
    public static void checkPrime(int n)
    {
        boolean isPrime=true;
        if(n<2)
        {
            isPrime=false;
        }
        else
        {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                }
            }
        }
        String res= isPrime ? (n + " is Prime") : (n + " is not a Prime");
        System.out.println(res);
    }
}
