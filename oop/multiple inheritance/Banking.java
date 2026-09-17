interface accountno{
    void diposite(double amount);
}
interface loan{
    void applyloan(double ammount);

}
class smartaccount implements accountno,loan{
    double balance;
    String Acountname;
    // public smartaccount(double balance,String Acountname){
    //     this.balance=balance;
    //     this.Acountname=Acountname;
    // }
    @Override 
    public void diposite(double amount){
        if(amount>0){
             balance+=amount;
             System.out.println("Amount deposited: "+amount+" \n New balance: "+balance);
        }
        else{
System.out.println("Invalid amount. Please enter a positive value.");
        }
      
    }
    @Override 
    public void applyloan(double amount){
        if(amount>0){
            System.out.println("Loan applied for: "+amount);
        }
        else{
            System.out.println("Invalid loan amount. Please enter a positive value.");
        }
    }
}

public class Banking{
    public static void main(String[] args) {
       smartaccount acc1=new smartaccount();
       acc1.Acountname="shiv";
       acc1.balance=6000;
       
       acc1.diposite(1000);
       acc1.applyloan(5000);
    }
}