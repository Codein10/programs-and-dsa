public class inserstionsort {
    public static void getinserstionsort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
        int curr=arr[i];
        int prev=i-1;
        while (prev>=0&&arr[prev]>curr) {
         arr[prev+1]=arr[prev];
         prev--;
            
        }
        arr[prev+1]=curr;
    }
   
    }
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    } 
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        getinserstionsort(arr);
        printarr(arr);
    }
}
