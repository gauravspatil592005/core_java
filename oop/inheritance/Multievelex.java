
class  vechicle{
    void vechicle(){
           
    }
}
class startcar extends vechicle {
    void startcar() {
        System.out.println("he is driver");
    }
}
class colour extends startcar {
    void colour() {
        System.out.println("colour is red");
    }
}

class luxeruy extends startcar{
    void colour() {
        System.out.println("bmw");
    }
}

public class Multievelex {

    
  public static void main(String[] args) {

    colour obj = new colour();

    obj.startcar();
    obj.colour();
   
}
   

    }

