
public class Recurstion {
 //print number decresing order
     public static void printdec(int n){
        if (n==1) {
            System.out.println( n);
            return;
        }
        System.out.println(n+" ");
        printdec(n-1);
    }

   //print number incresing order
     public static void prininc(int n) {
      if (n==1) {
        System.out.print(n+" ");
        return;
      }
      prininc(n-1);
      System.out.print(n+" ");
    
   }

   //print the factorial of number
   public static int getfact(int n){
    if(n==0){
       // System.out.println(1);
        return 1;
    }
    int nm1= getfact(n-1);
    int nm2= n*getfact(n-1);
    return nm2;
   } 

   
//print sum of n natural number
public static int calsum(int n){
  if (n==1) {
    return 1;
  }
  int snm1=calsum(n-1);
  int sum=n+snm1;
  return sum;

}

//print nth fibonacci number
public static int getfibonacci(int n){
  if (n==0||n==1) {
    return n;
  }
  int nm1=getfibonacci(n-1);
  int nm2=getfibonacci(n-2);
  int fibo=nm1+nm2;
  return fibo;
}

//check array is sorted or not
public static boolean issorted(int arr[] ,int i){
  if (i==arr.length-1) {
    return true;
  }
  if (arr[i]>arr[i+1]) {
    return false;
  }
  return issorted(arr, i+1);
}

//first occurence of element in array
public static int firstocc(int arr[],int i,int key){
  if (i==arr.length) {
    return -1;
  }
  if (arr[i]==key) {
     return i;
  }
  return firstocc(arr, i+1, key);

}

//find last occurence element
public static int lastocc(int arr[],int i,int key){
  if (i==arr.length) {
    return -1;
  }
  int isfound=lastocc(arr, i+1, key);
  if (isfound==-1&&arr[i]==key) {
    return i;
  }
  return isfound;
}

//print x^n
public static int power(int x,int n){
  if (n==0) {
    return 1;
  }
 // int xponm1=power(x, n-1);
  //int xpon=x*xponm1;
  //return xpon;
  //or
  return x*power(x, n-1);
}

//optimaze power
public static int getpower(int x,int n){
  if(n==0){
    return 1;
  }
  //even
  int halfpower=getpower(x, n/2);
  int halfpowersq=halfpower*halfpower;
  //odd
  if (n%2!=0) {
    halfpowersq=x*halfpowersq;
  }
  return halfpowersq;
}

//solve tiling problem
public static int tilingway(int n){
  //base case
  if (n==0||n==1) {
    return 1;
  }
  //kaam
  //vertical
  int nm1=tilingway(n-1);
  //horizontal
  int nm2=tilingway(n-2);
  int totalway=nm1+nm2;
  return totalway;

}
//remove duplicat character from string
public static void removedubli(String str,StringBuilder newstr ,int idx,boolean map[]){
//base case
if (idx==str.length()) {
  System.out.println(newstr);
  return;
}
//kaam
char currchar=str.charAt(idx);
if (map[currchar-'a']==true) {
  removedubli(str, newstr, idx, map);
}else{
  map[currchar-'a']=true;
  removedubli(str, newstr.append(currchar), idx+1, map);
}
}

//solve pairing friends problem

public static int pairing(int n){
  if (n==1||n==2) {
    return n;
  }
  /*//choise
  //singal
  int nm1=pairing(n-1);
  //pair
  int nm2=pairing(n-2);
  int totpair=(n-1)*nm2;

//total way
int totalway=nm1+totpair;
//return totalway;*/

//or
return pairing(n-1)+(n-1)*pairing(n-2);
}

//binary String problem without concative bit
public static void binstring(int n,String str,int lastplace){
  if (n==0) {
    System.out.println(str);
    return;
  }
  //str 0
 binstring(n-1,str+"0", 0);
if (lastplace==0) {
  binstring(n-1, str+"1", 1);
}

}

    public static void main(String[] args) {
       // printdec(10);
   
       // prininc(10);
   
     //  System.out.println(getfact(5));
    
   //System.out.println(calsum(10));
    
     // System.out.println(getfibonacci(7));
    
    //int arr[]={1,2,6,4,5};
     //System.out.println(issorted(arr, 0));
    
     // int arr[]={1,2,3,4,5,6,3,2};
     //System.out.println(firstocc(arr, 0, 3));
     //System.out.println(lastocc(arr, 0, 3));
    
     //System.out.println(power(2, 10));
    
    //System.out.println(getpower(2, 10));
    
    //System.out.println(tilingway(4));

    String str="appnnacollege";
  removedubli(str, new StringBuilder(""), 0, null);

   // System.out.println(pairing(5));
  
 //  binstring(3, "", 0);
 //  System.out.println(binstring(3, "", 0));
    }
}