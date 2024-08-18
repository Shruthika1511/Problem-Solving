package PackageProblems;

import java.util.*;

public class SortingOfFactorsInDescending {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int[][] factorInfo = new int[n][2];
        for (int i = 0; i < n; i++) {
            factorInfo[i][0] = a[i];  
            factorInfo[i][1] = countFactors(a[i]); 
        }
        Arrays.sort(factorInfo, (x, y) -> {
            if (x[1] == y[1]) {
                return y[0] - x[0];
            }
            return y[1] - x[1];
        });
        for (int i = 0; i < n; i++) {
            System.out.print(factorInfo[i][0] + " ");
        }
    }
    private static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}

