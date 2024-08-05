import java.util.*;

public class PalindromeRemoval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result = removeUnwantedNumbers(num);
        System.out.println(result);
    }

    static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static int removeUnwantedNumbers(int num) {
        String s = Integer.toString(num);
        if (isPalindrome(s)) {
            return num;
        }

        for (int i = 0; i < s.length(); i++) {
            String modifiedString = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(modifiedString)) {
                return Integer.parseInt(modifiedString);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String modifiedString = s.substring(0, i) + s.substring(i + 1, j) + s.substring(j + 1);
                if (isPalindrome(modifiedString)) {
                    return Integer.parseInt(modifiedString);
                }
            }
        }

        return num;
    }
}
