import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to factorial");
    System.out.println("Enter the number: ");
    int num=input.nextInt();
    System.out.println("factorial is: "+factorial(num));
   } 
   public static long  factorial(int num){
    if(num<2)
    return 1;
     long fact=1;
    int i=2;
    while(i<=num){
        fact*=i;
        i++;
    }
    return fact;
   }
}
