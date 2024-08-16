package PackageProblems;

import java.util.Scanner;

public class MergeAndSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < k; j++) {
                if (merged[j] == a[i]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                merged[k++] = a[i];
            }
        }
        for (int i = 0; i < m; i++) {
            boolean exists = false;
            for (int j = 0; j < k; j++) {
                if (merged[j] == b[i]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                merged[k++] = b[i];
            }
        }
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
