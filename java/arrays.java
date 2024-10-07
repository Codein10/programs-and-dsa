
public class arrays {
   /*  public static void update(int marks[]) {
        for ( int i = 0; i < marks.length; i++) {
           marks[i]=marks[i]+1;
        }
        
    }*/ 

public  static int  linearsearch(int number[], int key) {

for (int i = 0; i < number.length; i++) {
    if (number[i]==key){
        return i;
    }
    }
    return -1;
}

    


    public static void main(String args[]) {
       
       /*  int marks[]=new int [100];
        Scanner sc= new Scanner(System.in);
        System.out.println(marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();


        System.out.println("phy"+marks[0]);
        System.out.println("che"+marks[1]);
        System.out.println("math"+marks[2]);
*/ 
/*int marks[]={2,4,6};
     update(marks);

     for ( int i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");
     }
     System.out.println();
 */

     // linear search
     int number[]={13,5,7,8,6,4,2};
     int key=13;
     int index= linearsearch(number, key);
     if(index==-1){
        System.out.println("not found");
     }else{
        System.out.println("key at index"+ " "+index);
     }
        }
        }
