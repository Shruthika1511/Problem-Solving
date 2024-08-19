package PackageProblems;
import java.util.Scanner;
public class WordEquivalentOfNo {
	    private static final String[] ONES = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	    private static final String[] TEENS = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	    private static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        if (number < 0 || number > 999) {
	            System.out.println("Number out of range");
	            return;
	        }
	        System.out.println(convertToWords(number));
	    }
	    private static String convertToWords(int number) {
	        if (number == 0) {
	            return ONES[0];
	        }
	        if (number < 10) {
	            return ONES[number];
	        } else if (number < 20) {
	            return TEENS[number - 10];
	        } else if (number < 100) {
	            return TENS[number / 10] + (number % 10 > 0 ? " " + ONES[number % 10] : "");
	        } else {
	            return ONES[number / 100] + " Hundred" + (number % 100 > 0 ? " " + convertToWords(number % 100) : "");
	        }
	    }
	}