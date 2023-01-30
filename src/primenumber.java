// check the given number is prime or not
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            count = 0;
            for (int div = 2; div * div <= n; div++) {
                count++;
              //  break;
            }
        }
        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
