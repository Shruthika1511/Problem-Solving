public class ArmstrongNumberInGivenRange {
    public static void main(String[] args) {
        int num1 = 10, num2 = 1000;
        Armstrong(num1, num2);
    }

    static void Armstrong(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int sum = 0;
            int temp = i;
            int len = String.valueOf(i).length();

            while (temp != 0) {
                int n = temp % 10;
                int en = (int) Math.pow(n, len);
                sum += en;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
