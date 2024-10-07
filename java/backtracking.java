public class backtracking {
    //backtraking in array
    public static void backtrakinarray(int arr[],int i,int val){
      //base case
      if (i==arr.length) {
        System.out.println(arr);
        return;
      }
      //recurstion
      arr[i]=val;
      backtrakinarray(arr, i+1, val+1);
      arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        System.out.print(arr[i]+" ");
       
    }
       
  
    public static void main(String[] args) {
        int arr[]=new int[5];
        backtrakinarray(arr, 0, 1);
        printArr(arr);
    }
    
}
