import java.util.Scanner;

public class sumodd {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to Odd sum");
    System.out.println("Please enter your number: ");
    int num=input.nextInt();
    System.out.println("Odd till "+num+" is: "+odd(num));

   } 
   public static int odd(int num){
    int i=1;
    int sum=0;
    while(i<=num){
        if(i%2!=0){
            sum+=i;
            i+=2;
        }
    }
    return sum;
   }
}
