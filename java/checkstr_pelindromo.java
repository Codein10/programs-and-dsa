import java.util.*;
public class checkstr_pelindromo {
    public static boolean getpelindromo(String str){
        int n=str.length();
      for (int i = 0; i < (str.length()-1)/2;  i++) {
                if (str.charAt(i)!=str.charAt(n-1-i)) {
                       return false;
                    
                }
            
      }
      return true;
    }





    public static void main(String[] args) {
        String str="car";
        System.out.println(getpelindromo(str));
    }
    
}
