// class parent{
//     String name;

// }
// class child extends parent{
//     String name="child";
// }
class parent{
    parent(){
        System.out.println("parent constructor");
    }
}
class child{
    String name="child";
    public void printname(){
        System.out.println("child constructor"+name);
        System.out.println("child constructor"super.);

    }
}

public class super_ex{
    public static void main(String[] args) {
        child child=new child();
        child.name();
        
        
    }
}