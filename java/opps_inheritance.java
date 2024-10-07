public class opps_inheritance {
    public static void main(String[] args) {
       dog d1=new dog();
        d1.eatanimal();
      //  System.out.println(d1.eatanimal());
       d1.sleepdog();
    }
    
}
//single inheritance
//hirerical inheritance
//hybrid inheritance
//multilavel inheritance
class animal{
void eatanimal(){
    System.out.println("animal is eating");
}

}
class dog extends animal{
void sleepdog(){
    System.out.println("dog is sleep");
}
}
class rabbit extends animal{
    void running(){
        System.out.println("rabbit is running");
    }
}class cow extends rabbit{
    void stand(){
        System.out.println("cow is stand");
    }
}