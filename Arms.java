public class Arms {
    public static void main(String[] args)
    {
        int num=134;
        int c=0,i;
        int sum=0;
        for(i=num;i>0;i=i/10,c++);
        for(i=num;i>0;sum=sum+(int)Math.pow(i%10,c),i=i/10);
        String l=(sum==num)?"ArmsTrong Number":"Not a Armstrong number";
        System.out.println(l);
    }
}
