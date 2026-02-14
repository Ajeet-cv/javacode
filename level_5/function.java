import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        greeting();
        int firstnumber=readnumber();
        int secondnumber=readnumber();
        int sum=firstnumber+secondnumber;
        System.out.println("Sum of numbers are : "+ sum);

    }
    public static void  greeting(){
        System.out.println("Welcome to function Calculator: ");
    }
    public static int readnumber(){
     System.out.println("Please enter the number: ");
     Scanner input=new Scanner(System.in);
     int number=input.nextInt();
     return number;
    }
}
