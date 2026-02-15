import java.util.Scanner;

public class fibonacci {
   public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Welcome to fibonacci series calculator");
    System.out.println("Please enter the no of term");
    int term=input.nextInt();
    System.out.println("fibonacci series is :");
    for(int i=1;i<=term;i++){
    System.out.print(fib(i)+" ");
    }
   } 
   public static int fib(int term){
    if(term<=1){
        return 0;
    }
    if(term==2){
   // System.out.println("1");
    return 1;
    }
    else{
       
     return fib(term-1)+fib(term-2);
    }
   }
}
