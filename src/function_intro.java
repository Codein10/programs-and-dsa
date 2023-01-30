import java.util.Scanner;

public class function_intro {
    public  static int getdigitfrequency(int n, int d) {
        int rv = 0;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            if (dig == d) {
                rv++;
            }
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f=getdigitfrequency(n,d);
        System.out.println(f);

    }
}
