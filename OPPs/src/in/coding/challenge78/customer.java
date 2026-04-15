package in.coding.challenge78;

public class customer {
    static void main() {
        BankAccount account=new BankAccount("001","Ajeet chaurasiya");
        account.depositmoney(100);
        System.out.println(account.withdrawmoney(200));
        account.depositmoney(-40);
        account.withdrawmoney(0);
    }
}
