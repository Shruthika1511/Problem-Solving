public class Seat {
    public static void main(String[] args){
            // TODO Auto-generated method stub
            String[] seat = {"l", "m", "u", "l", "m", "u", "sl", "su"};
            int n = 34;
            int index = (n - 1) % seat.length;
            System.out.println("The value at position " + n + " is: " + seat[index]);
    }
}
