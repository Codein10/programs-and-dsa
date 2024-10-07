public class opps_polymorfhism {
    public static void main(String[] args) {
      //  calculator c1=new calculator();
        //c1.add(5f, 6f);
        //System.out.println(c1.add(5f, 6f));
        //System.out.println(c1.add(74, 51, 65));

     //   deer d1=new deer();
     //   d1.eat();

     chiken c1=new chiken();
     c1.walk();
    }
}
//compile time polymorphigm
//1 method overloading
/*class calculator{
int  add(int a,int b){
    return a+b;
}
float add(float a,float b){
    return a+b;
}
int add(int a,int b,int c){
    return a+b+c;
}
}*/
//run time polymorphigm
//method overriding
/*class animal{
    void eat(){
        System.out.println("animal eat");

    }
}
class deer extends animal{
    void eat(){
        System.out.println("grass eat");
    }
}
*/
//abstraction
abstract class animal{
    void eat(){
    System.out.println("animal eat");
    }
    abstract void walk();
}
class horse extends animal{
void walk(){
    System.out.println("horse walk four lags");
}
}
class chiken extends horse{
    void walk(){
        System.out.println("walk with 2 lags");
    }
}
