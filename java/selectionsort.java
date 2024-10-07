public class selectionsort {
    public static void getslectionsort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int minpossition=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minpossition]<array[j]) {
                   minpossition=j;
                    
                }
            }
            int temp=array[minpossition];
            array[minpossition]=array[i];
            array[i]=temp;
        }
       
    }
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int array[]={5,4,1,3,2};
        getslectionsort(array);
        printarr(array);
    }
    
}
