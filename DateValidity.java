package PackageProblems;
import java.util.*;
public class DateValidity {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String date = inp.nextLine();
        String result = isValidDate(date) ? "Valid" : "Invalid";
        System.out.println(result);
        }
        public static boolean isValidDate(String date) {
            String[] parts = date.split("/");
            if (parts.length != 3) {
                return false;
                }
                int day, month, year;
                try {
                    day = Integer.parseInt(parts[0]);
                    month = Integer.parseInt(parts[1]);
                    year = Integer.parseInt(parts[2]);
                    } catch (NumberFormatException e) {
                        return false;
                        }
                        if (year < 1 || month < 1 || month > 12 || day < 1) {
                            return false;
                            }
                            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                            if (isLeapYear(year)) {
                                daysInMonth[1] = 29;
                                }
                                if (day > daysInMonth[month - 1]) {
                                    return false;
                                    }
                                    return true;
                                    }
                                    public static boolean isLeapYear(int year) {
                                        if (year % 4 == 0) {
                                            if (year % 100 == 0) {
                                                return year % 400 == 0;
                                                }
                                                return true;
                                                }
                                                return false;
                                                }

}
