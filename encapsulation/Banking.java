class account{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountDetails(){
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Balance: " + balance;
    }
}
public class Banking{
    public static void main(String[] args){
       account acc1=new account("123456", "John Doe", 10000.0);
         
       acc1.deposit(2000);
       acc1.withdraw(500);
       System.out.println(acc1.getAccountDetails());
       System.out.println("Current Balance: " + acc1.getBalance());
    }
}