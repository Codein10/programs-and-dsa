public class arraylargestnum {
    public static int getlargest(int numbers[]) {
    
        int largestnumber=Integer.MIN_VALUE;
        int smalestnum=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (largestnumber<numbers[i]) {
                largestnumber=numbers[i];
                
            }
            if (smalestnum>numbers[i]) {
                smalestnum=numbers[i];

                //print smallest number
                System.out.println(smalestnum);
            }
        }
        return largestnumber;
        
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};

        //print largest number

        System.out.println("largest number is"+ " "+getlargest(numbers));

    }
    
}
