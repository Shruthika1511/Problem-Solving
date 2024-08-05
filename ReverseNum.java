public class ReverseNum {
    public static void main(String[] args)
    {
        int num=2345;
        int reverse=0;
        /*while(num!=0)
        {
            int rem=num%10;
            num/=10;
            reverse=reverse*10+rem;
        }*/
        for(int i=num;i>0;reverse=reverse*10+(i%10),i=i/10);
        System.out.println(reverse);
    }
}



