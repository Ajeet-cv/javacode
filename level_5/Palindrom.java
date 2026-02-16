import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the palindrom calculator");
        System.out.println("Please enter your number to be check palindrom");
        int num=input.nextInt();
        if(ispalindrom(num)){
            System.out.println("yes,number is palindrom");
        }
        else{
            System.out.println("No,number is not palindrome");
        }
    }
    public static boolean ispalindrom(int num){
        int n=num;
        int reverse=0;
        while(num>0){
            reverse=reverse*10+num%10;
            num=num/10;
        }
        if(reverse==n)
            return true;
        return false;
    }
}
