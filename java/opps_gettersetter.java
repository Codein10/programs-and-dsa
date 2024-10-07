public class opps_gettersetter { 
    public static void main(String[] args) {
      pen p1=new pen() ;
      p1.setColour("blue");
      System.out.println(p1.getcolour()); 

      p1.setTip(2);
      System.out.println(p1.gettip());
    }
    
}

class pen {
    private String colour;
    private int tip;

    public void setColour(String newcolour) {  // setter modify te value
        this.colour = newcolour;  //this keyword is used to refer the current object 
    }
    public void setTip(int newtip) {
        this.tip = newtip;
    }
    String getcolour(){   //getter return te value
        return this.colour;
    }
    int gettip(){
      return this.tip;
    }
}
