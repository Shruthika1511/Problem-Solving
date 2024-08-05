public class ArmStrongNumber {
    public static void main(String[] args)
    {
        int num=371;
        int len;
        len=String.valueOf(num).length();
        if(checkArmstrong(num,len)) {
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not Armstrong Number");
    }
    static boolean checkArmstrong(int num, int len)
    {
        int sum=0;
        int temp=num;
        while(num!=0)
        {
            int n=num%10;
            int en=(int)Math.pow(n,len);
            sum+=en;
            num/=10;
        }
        boolean b = temp == sum;
        return b;
    }

}
