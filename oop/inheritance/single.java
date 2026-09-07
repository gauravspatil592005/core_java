class account
{
    String name;
    double balance;
    void deposite(double  amount){
        balance+=amount;
        System.out.println("deposite"+amount +"new balance:"+balance);
    }

}
class savingsAccount extends account{
double interestrate;
    void applyinterest(){
       double interest = balance * interestrate /100;
        System.out.println("interest:"+interest +"new balance:"+balance);
    }
}
class premiumAccount extends account{
    double premiuminterestrate;
    void extrainterest(){
        double  premiuminterest = balance * premiuminterestrate /100;
        System.out.println("premium interest:"+premiuminterest +"new balance:"+balance);
    }
    class savingAccount extends account{
        double interestrate;
        void applyinterest(){
           double interest = balance * interestrate /100;
            System.out.println("interest:"+interest +"new balance:"+balance);
        }
    }
}
class currentAccount extends account{
    double overdraftlimit;
    void withdraw(double amount){
        if (balance + overdraftlimit >= amount) {
            balance -= amount;
            System.out.println("withdrawn:" + amount + " new balance:" + balance);
        } else {
            System.out.println("withdrawal denied. overdraft limit exceeded.");
        }
    }
}

public class single {
    public static void main(String[] args) {
        savingsAccount savingsAccount= new savingsAccount();
        savingsAccount . name = "John Doe";
        savingsAccount . balance = 1000.0;
        savingsAccount . interestrate = 8.0;
        savingsAccount . deposite(500.0);
        savingsAccount . applyinterest();
         premiumAccount premiumAccount= new premiumAccount();
         premiumAccount.premiuminterestrate=10.0;
         premiumAccount. deposite(500.0);
         currentAccount obj=new currentAccount();
         obj.overdraftlimit=2000;
         obj.balance=2000;
         obj.withdraw(2000);
    
    
        
    }
    
}
