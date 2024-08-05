public class SumOfDigits {
    public static void main(String[] args)
    {
        int num=543;
        sumofDigits(num);
        System.out.println(sumofDigits(num));
    }
    public static int sumofDigits(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int i=num%10;
            sum+=i;
            num/=10;
        }
        //return sum;
        return sum;
    }

}
