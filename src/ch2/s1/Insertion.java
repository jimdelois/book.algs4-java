package ch2.s1;

public class Insertion extends Example {

    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {

            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exchange(a, j, j-1);
            }

        }
    }
}
