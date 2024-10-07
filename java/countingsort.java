public class countingsort {

    public static void getcountingsort(int arr[]) {
        int largest=Integer.MIN_VALUE;
        
            for (int i = 0; i < arr.length; i++) {
                largest=Math.max(largest, arr[i]);

            }
            int count[]=new int[largest+1];
            for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
            }
            int j=0;
            for (int i = 0; i < count.length; i++) {
                while (count[i]>0) {
                    arr[i]=i;
                    j++;
                    count[i]--;
                }
            }
        
    }
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    } 
            public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        getcountingsort(arr);
        printarr(arr);
    }
    
}
