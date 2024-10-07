import java.lang.annotation.Target;
import java.util.ArrayList;

public class arraylistpairsum {
    //two pointer approch
    public static boolean pairsum2(ArrayList<Integer>list,int target){
    int lp=0;
    int rp=list.size()-1;
    while(lp!=rp){
        if (list.get(lp)+list.get(rp)==target) {
            return true;
        }else if(list.get(lp)+list.get(rp)<target){
             lp++;
        }else{
            rp--;
        }
    }
    return false;
    }
    //bruteforce approch
    public static boolean pairsum(ArrayList<Integer>list,int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if (list.get(i)+list.get(j)==target) {
                    return true;
                }
            }
        }
        return false;
    }
//pair sum in roteted list
    public static boolean pairsum3( ArrayList<Integer>list1,int target){
        int brkpoint=-1;
        int n=list1.size();
        for (int i=0;i<list1.size();i++){
            if (list1.get(i)>list1.get(i+1)) {
                brkpoint=i;
            
            int lp=brkpoint+1;//smallest
            int rp=brkpoint;//largest
            while (lp!=rp) {
                //case1
                if (list1.get(lp)+list1.get(rp)==target) {
                    return true;
                }
                //case 2
                else if(list1.get(lp)+list1.get(rp)<target){
                lp=(lp+1)%n;
                }else{
                    rp=(n+rp-1)%n;
                }
            }
        }
        
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        //sorted list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       int target=6;
       //roteted list
       list1.add(11);
       list1.add(15);
       list1.add(6);
       list1.add(8);
       list1.add(9);
       list1.add(10);
  //System.out.println(pairsum(list, target));
    //   System.out.println(pairsum2(list, target)); 
       System.out.println(pairsum3(list1, target));
    }
}
