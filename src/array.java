public class array {
    public static void swap(int[]arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[]arr;
        arr=new int[5];
        arr[0]=33;
        arr[1]=45;
        arr[2]=22;
        arr[3]=66;
        arr[4]=54;
        //int[]two=arr;
        //two[2]=200;
        swap(arr ,0,3 );
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
