package in.coding.challenge78;

public class BankAccount {
    private String accountnuber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountnuber, String accountHolderName) {
        this.accountnuber = accountnuber;
        this.accountHolderName = accountHolderName;
    }

    public void depositmoney(double money){
        if(money<=0){
            System.out.println("Invalid Deposit");
        }
        else {
            balance += money;
        }
    }
    public double withdrawmoney(double money){
        if(money<=0){
            System.out.println("Invalid Withdraw ");
        }else if(balance>=money) {
            balance -= money;
        }else{
            money=balance;
            balance=0;
        }
        return money;
    }
}
