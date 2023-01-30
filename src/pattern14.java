import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        int n=sc.nextInt();
        int a=1;
        for (int i=1;i<=10;i++){
            int c=n*a;
            System.out.println( n+"*"+a+"="+c);
            a++;
        }
    }
}
