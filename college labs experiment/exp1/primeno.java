/*
    Write a program that takes input from user through command line argument and then prints whether a number is prime or not
     */

import java.util.Scanner;

public class primeno {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Please enter the number:");
        int n=input.nextInt();
        boolean prime = true;

        if(n <= 1) prime = false;

        for(int i=2;i<=n/2;i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    } 
}
/*            OUTPUT
   PS C:\Users\Ajeet Chaurasiya\OneDrive\Desktop\javacode\college labs experiment\exp1> java primeno
   Please enter the number: 
   11
   Prime Number
 */
