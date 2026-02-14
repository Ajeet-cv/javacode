import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to multiplication calculator world:");
        System.out.println("Enter the your number: ");
        int num=input.nextInt();
         multable(num);
    }
    public static void multable(int num){
        int row=1;
        while(row<=10){
            System.out.println(num+" X "+row+" = "+(num*row));
            row++;
        }
    }
}
