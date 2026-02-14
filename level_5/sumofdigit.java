import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num=input.nextInt();
        System.out.println("Sum of digit is: "+sumdigit(num));

    }
    public static int sumdigit(int num){
     int sum=0;
     while(num>0){
        sum+=num%10;
        num=num/10;
     } 
     return sum;
    }
}
