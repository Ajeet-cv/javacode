import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Welcom to Swapping station\n\n");
       System.out.print("Enter value of A: "); 
       int a=input.nextInt();
       System.out.print("Enter value of B: ");
       int b=input.nextInt();
       int c=a;
       a=b;
       b=c;
       System.out.println("After swapping value of A:  "+a);
       System.out.println("After swapping value of B: "+b);

    }
}
