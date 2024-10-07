public class divide_conqur {
    //merge short
    public static void mergeshort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeshort(arr, si, mid);
        mergeshort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }//merge
    public static void merge(int arr[],int si,int mid ,int ei){
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=mid&&j<=ei){
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //remaining element left part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //right side
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //copy temp to original arry
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
   
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeshort(arr, 0, arr.length-1);
        System.out.print(arr);
    }
}
