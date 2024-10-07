public class maxsumofsubarray_prifix{
    public static void getmaxsum(int numbers[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prifix[]=new int[numbers.length];
        prifix[0]=numbers[0];

        for (int i = 1; i < prifix.length; i++) {
            prifix[i]=prifix[i-1]+numbers[i];
         }

      for (int i = 0; i <numbers.length; i++) {
        int start=i;
        
        for (int j = 1; j < numbers.length; j++) {
            int end=j;
            currsum=start==0? prifix[end]:prifix[end]-prifix[start-1];

            if (maxsum<currsum){
                maxsum=currsum;
            }
        }
        
      }
      System.out.println(" max sum is"+ " "+maxsum);

    
    }
        
        
   public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        getmaxsum(numbers);
    }

    
}