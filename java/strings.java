import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
       // String str="dinesh";
        //String str1 =new String("dinesh")   ;
        //for (int i = 0; i < str.length(); i++) {
          //  System.out.print(str.charAt(i));
         /*    Scanner sc=new Scanner(System.in);
           String name=sc.nextLine();//nextline take multiple string at a time
           String name1=sc.next();//it take 1 string at a time
           System.out.println(name);
      //  } */


      String firstname="dinesh";
      String lastname="vishwakarma";
      String fullname=firstname+" "+lastname;//concatination
      System.out.println(fullname);
      for (int i = 0; i < fullname.length(); i++) {
        System.out.print(fullname.charAt(i)+" ");
         
      }
    }

    
}
