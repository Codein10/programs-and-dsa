public class Bit_operation {
    //get ith bit
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0) {
            return 0;
        }
        return 1;
    }
    //set ith bit
    public static int setithbit(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;

    //clear ith bit
    }public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    //update ith bit
    public static int updateithbit(int n, int i,int newbit){
        if (newbit==0) {
            return clearithbit(10, 2);
        }else{
            return setithbit(10, 2);
        }
    }
    //clear last i bit
    public static int clearlastibit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    //clear range of bit
    public static int clearrangebit(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    //check number is power of two or not
    public static boolean poweroftwo(int n){
     return ((n&(n-1))==0);
    }
    //count set bit of number
    public static int countsetbit(int n){
        int count=0;
        while(n>0){
            if ((n&1)!=0) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    //fast exponation
    public static int getexponation(int a,int n){
     int ans=1;
     while (n>0) {
        if ((n&1)!=0) {
            ans=ans*a;

        }
        a=a*a;
        n=n>>1;
     }
     return ans;
    }
    
    public static void main(String[] args) {
     //  System.out.println(getithbit(10, 2)); 
    //   System.out.println(setithbit(10, 2));
    //   System.out.println(clearithbit(10, 3));
    //   System.out.println(updateithbit(10, 2, 1));
    //   System.out.println(clearlastibit(10, 2));
   //  System.out.println(  clearrangebit(10, 2, 4));
  //   System.out.println(poweroftwo(10));
     System.out.println(countsetbit(15));
     System.out.println(getexponation(3, 5));
    }
}
