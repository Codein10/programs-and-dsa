import java.util.Scanner;

public class _2D_array {
public static boolean gettsearch(int matrix[][],int key){
    int n=3;
    int m=3;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
 if (matrix[i][j]==key) {
    System.out.print(i+","+j);
    return true;
 }
}
    }
    return false;

}
public static void main(String[] args) {
    

    int matrix[][]=new int[3][3];
  int n=3 ,m=3;
    int key= 5;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your number");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
         matrix[i][j]=sc.nextInt();            
        }
        
    }
    for (int i = 0; i <n; i++) {
        for (int j = 0; j < m; j++) {
           // System.out.print("("+i+","+ j+")")
        
        }
    }
    gettsearch(matrix, key);
}
    }