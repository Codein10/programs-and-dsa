import java.util.Scanner;
public class q4_of_ar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr1 = new int[n2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;
        int i = arr.length - 1;
        int j = arr1.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += arr[i];
            }
            if (j >= 0) {
                d += arr1[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.println(c);

        }
        for (int val : sum) {
            System.out.println(val);
        }
    }
}