import java.util.Scanner;

public class coumpound {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to Command interest calculator");
    System.out.print("Please enter ryour principle amount Rs: ");
    int principle=input.nextInt();
    System.out.println();
    System.out.print("Now,tell me  your rate of interest: ");
    float rate=input.nextFloat();
    System.out.println();
    System.out.print("Now, tell me for how many years are you borrowing this maoney: ");
    float year=input.nextFloat();
    double comp=principle*Math.pow((1+rate/100),year);
    System.out.println("Your compound interest is Rs: "+comp);
   }
}
