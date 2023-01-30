import java.util.Scanner;

public class anybase_to_anybase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int bs=anybase(n,b1,b2);
        System.out.println(bs);

    }
    public static int anybase(int n,int b1,int b2){
        int rv=0;
        int p=1;
        while (n>0){
            int dig=n%b2;
            n=n/b2;
            rv+=dig*p;
            p=p*b1;
        }
        return rv;
    }
}
