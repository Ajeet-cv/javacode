import java.util.Scanner;

public class arithmaticop {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to arithmatic calculator\n");
    System.out.print("Please enter the first number: ");
    int first=input.nextInt();
    System.out.print("Now,please enter the second number: ");
    int second=input.nextInt();

    int add=first+second;
    int sub=first-second;
    int mul=first*second;
    int div=first/second;
    int mod=first%second;

    System.out.println("Addition is: "+add);
    System.out.println("Substraction is: "+sub);
    System.out.println("Multiplication is: "+mul);
    System.out.println("Division is: "+div);
    System.out.println("Modulus is: "+mod);
    System.out.print("Please enter the first float number: ");
    float first1=input.nextFloat();
    System.out.print("Now,please enter the second float number: ");
    float second1=input.nextFloat();
    //work as a string
    System.out.println("addition of two number: "+first1+second1);
     System.out.println("addition of two number: "+(first1+second1));
    System.out.println("multiplication is: "+(first1*second1));
  }  
}
