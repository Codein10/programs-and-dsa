import java.util.Scanner;
public class Q2_OFAR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[] arr= new int[a];

        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int data=sc.nextInt();
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==data){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
