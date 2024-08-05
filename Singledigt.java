public class Singledigt {
    public static void main(String[] args)
    {
        long num= 99999999;
        long c=0,rem=0,sum=0;
        for(long i=num;i>0;c=c+(i%10),i=i/10);
        for(long j=c;j>0;rem=rem+(j%10),j=j/10);
        /*while(c!=0){
                rem = c % 10;
                c /= 10;
                sum += rem;
            }*/
        System.out.print(rem);

    }
}
