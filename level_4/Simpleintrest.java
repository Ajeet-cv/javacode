import java.util.Scanner;

public class Simpleintrest {
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcom to Simple Intereste Calculator");
    System.out.print("Please enter your principal amount: ");
    int principle=input.nextInt();
    System.out.println();
    System.out.print("Now, Tell me your rate of interest: ");
    float rate=input.nextFloat();
    System.out.println();
    System.out.print("Now ,tell me for how many years are you borrowing this money: ");
    float year=input.nextFloat();
    float simpleinterest=(principle*rate*year)/100;
    System.out.println("Your Simple interest is Rs: "+simpleinterest);

 }   
}
