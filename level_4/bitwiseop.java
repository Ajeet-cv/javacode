import java.util.Scanner;

public class bitwiseop {
    //find number is odd or even by using bitwise operator
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Odd/even calculator");
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        if((num&1)==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
