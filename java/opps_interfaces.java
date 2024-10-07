public class opps_interfaces {

    public static void main(String[] args) {
   /*      queen q=new queen();
        q.moves();
        king k=new king();
        k.moves();*/
        
       /*  bear b=new bear();
        b.vegiterion();
        b.nonvegiterion();
        */

       /*  student s=new student();
        s.collagename="ritm";
        s.name="dinesh";
        System.out.println(s.getname());

        student s2=new student();
        System.out.println(s2.collagename);
        */

        Horse h1=new Horse();
    
    }
}
/*interface chessplayer{
    void moves();
}
class queen implements chessplayer{
 public  void moves(){
        System.out.println("left,right,up ,down ,( 4 direction)");
    }
}
class rook implements chessplayer{
public void moves(){
    System.out.println("up,down,left,right");
}
}
class king implements chessplayer{
    public void moves(){
        System.out.println("up, down,left,right( by1)");
    }
}*/


//multiple ineritance

/*interface herbivore{
    void vegiterion();
}
interface carnivore{
    void nonvegiterion();
}
class bear implements herbivore,carnivore{
    public void vegiterion(){
        System.out.println("eat vegitable");
    }
    public void nonvegiterion(){
        System.out.println("meat eat");
    }
}*/


//static keyword

/*class student{
    String name ;
    int rollno;
    static String collagename;

    void setname(String name){
        this.name=name;
    }
   String getname(){
       return this.name;
    }
    
}*/

//super keyword

class Animal{
    String colour;
    Animal(){
        System.out.println("this is animal constructor");
    }
}
class Horse extends Animal {
    Horse(){
       // super();
    System.out.println("this is horse constructor");
    }
   
    }
