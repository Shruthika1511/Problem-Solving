public class LeapYear {
    public static void main(String[] args)
    {
        int year=2004;
        int flag=(year%400==0)||(year%4==0 && year%100!=0)?1:0;//Ternary Condition
        if(flag==1)
        {
            System.out.println("LeapYear");
        }
        else
        {
            System.out.println("Not a LeapYear");
        }

    }

}
