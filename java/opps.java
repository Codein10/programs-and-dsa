

public class opps {
    public static void main(String[] args) {
    /*     pen p1=new pen();
        p1.colour="blue";
        p1.setcolour("black");
        System.out.println(p1.colour);
        p1.settip(5);
     System.out.println(p1.tip);*/

     bankaccount union=new bankaccount();
     union.username="dinesh vishwakarma";
     System.out.println(union.username);
  //  union.setpassword("vish");//here te privte password not accessble
  
     
    
    }
}
/*class pen{
String colour;
int tip;
void setcolour(String  newcolour){
    colour=newcolour;
}
void settip(int newtip){
    tip=newtip;
}
} */

class bankaccount{
    String username;
    private String passwrd;

    public void setpassword(String pssw){
        passwrd=pssw;
    }
    
}
