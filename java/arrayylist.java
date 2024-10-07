import java.util.ArrayList;
import java.util.Collections;

public class arrayylist {
  public static void swap(ArrayList<Integer>list1, int idx1,int idx2){
    int temp=list1.get(idx1);
   // idx2=list1.get(idx1);
    //idx1=temp;
    list1.set(idx1,list1.get(idx2));
    list1.set(idx2,temp );
  }
    
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        
        list1.add(1);
        list1.add(5);
        list1.add(2);
        list1.add(3);

      //  int idx1=1,idx2=3;
       // System.out.println(list1);
      //  swap(list1, idx1, idx2);
     // System.out.println(swap(list1, idx1, idx2));
      
       //sort the list
       Collections.sort(list1);
       System.out.println(list1);//assending order

       

        //array list operation

       // System.out.println(list1);
        //list1.get(0);
       // System.out.println(list1);
       //list1.remove(2);
     //  System.out.println(list1);
      // list1.set(2, 8);
      // System.out.println(list1);
     //  list1.contains(2);
       //System.out.println(list1);

       //reverse the list
      /*  for (int i=list1.size()-1; i >=0 ; i--) {
        System.out.println(list1.get(i));
*/
        //maximum in list
      /*  int max=Integer.MIN_VALUE;
         for (int j = 0; j < list1.size(); j++) {
         // if (max<list1.get(j)) {
         //   max=list1.get(j);
         // }
       // }
        max=Math.max(max, list1.get(j));
       
        
       }
       System.out.println(max);
       */


      // swap two number in a list


    }}

