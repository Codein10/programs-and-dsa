import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int num=sc. nextInt();
        int dig =0;
        while(num!=0){
            num=num/10;
            dig++;
        }
        System.out.println(dig);
    }
}
