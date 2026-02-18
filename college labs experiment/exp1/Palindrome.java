 /*   Write a program to enter number through command line and check whether it is palindrome or not.
  */
 import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Please enter the no.");
        int n = input.nextInt();
        int temp = n, rev = 0;

        while(n > 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    } 
}
/*           OUTPUT
  Please enter the no.
123
Not Palindrome
PS C:\Users\Ajeet Chaurasiya\OneDrive\Desktop\javacode\college labs experiment\exp1>
 */
