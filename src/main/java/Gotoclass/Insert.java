package Gotoclass;

public class Insert {
    public static void main(String[] args) {

        {
            int[] a = {10, 4, 2, 0, 2, 8};
            int j;
            for (int i = 1; i < a.length; i++) {
                int temp = a[i];
                for (j = i; j > 0 && temp < a[j - 1]; j--) {
                    a[j] = a[j - 1];
                }
                a[j] = temp;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
