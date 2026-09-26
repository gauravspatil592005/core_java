

class bank{
     private String name;
     private  int no;
     private double balance;
     

public void setname(String name){
    this.name=name;
    
}

public  String getname() {
return  name;
}
public void setbal(double balance){
     this.balance=balance;
}
public double getbal(){
return balance;
}
public void setno(int no){
this.no=no;
}
public int getno() {
        return no;
    }
public void recieipt(){
    return ;
}
}

public class Studentdet {
    public static void main(String[] args) {
         bank bak=new bank();
        bak.setname("siva");
        bak.setno(852822822);
        bak.setbal(5000);
        bak.recieipt();
        
        System.out.println(bak.getname());
        System.out.println(bak.getno());
           System.out.println(bak.getbal());
     


    }
