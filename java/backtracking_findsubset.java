public class backtracking_findsubset {
  /*   public static void findsubset(String str ,int i,String ans){
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // yes choise
        findsubset(str, i+1, ans+str.charAt(i));
        //no choise
        findsubset(str, i+1, ans);
    }

*/
    //find &&print all permutations

    public static void findpermutations(String str,String ans){

        //base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        //recurstion
        for (int i = 0; i < str.length(); i++) {
           char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            findpermutations(newstr, ans+curr);
            
        }}
    
    public static void main(String[] args) {
        String str="abc";
       // findsubset(str, 0, " ");
       findpermutations(str, " ");
    }
}
