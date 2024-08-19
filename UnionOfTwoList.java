package PackageProblems;

import java.util.*;

public class UnionOfTwoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        Set<Integer> unionSet = new TreeSet<>(); // TreeSet to automatically sort the elements
        unionSet.addAll(list1);
        unionSet.addAll(list2);

        if (unionSet.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int num : unionSet) {
                System.out.print(num + " ");
            }
        }
    }
}
