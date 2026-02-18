 /*   Write a Java program to create a BankAccount class using encapsulation (private data members) and perform operations such as deposit, withdraw, and display balance using menu-driven choices.
  */
 import java.util.Scanner;

class BankAccount {
    private double balance = 0;

    void deposit(double amt){
        balance += amt;
        System.out.println("Deposited Successfully");
    }

    void withdraw(double amt){
        if(amt > balance)
            System.out.println("Insufficient Balance");
        else{
            balance -= amt;
            System.out.println("Withdraw Successful");
        }
    }

    void display(){
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        int choice;

        do {
            System.out.println("Choose the option: ");
            System.out.println("\n1.Deposit 2.Withdraw 3.Display 4.Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.display();
                    break;
            }

        } while(choice != 4);
    }
}
/*              OUTPUT
   Choose the option: 

1.Deposit 2.Withdraw 3.Display 4.Exit
1
Enter amount: 200
Deposited Successfully
 */

