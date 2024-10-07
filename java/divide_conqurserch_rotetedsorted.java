public class divide_conqurserch_rotetedsorted {
    public static int search(int arr[],int tar,int ei,int si){
        if (si>ei){
            return-1;
        }
        int mid=si+(ei-si)/2;
        //case found
        if (arr[mid]==tar){
            return mid;
        }
        //mid on l1
        if (arr[si]<=arr[mid]) {
            //case 1 left
            if (arr[si]<=tar&&tar<=arr[mid]) {
                return search(arr, tar, mid-1, si);
            }else{
                //case 2 right
                return search(arr, tar, ei, mid+1);
            }
        }
        if (arr[mid]<=tar&&tar<=ei) {
            //case 3right
            return search(arr, tar, ei, mid+1);

        }else{
            //case 4 left
            return search(arr, tar, mid-1, si);
        }
    } 
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        int taridx=search(arr, tar, arr.length-1, 0);
        System.out.print(taridx);
    }
    
}
