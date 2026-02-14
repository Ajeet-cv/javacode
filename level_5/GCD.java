import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
    System.out.println("Please enter your number ");
    int first= input.nextInt();
    System.out.println("Please enter your number ");
    int second= input.nextInt();
    System.out.println("GCD of the number is:"+GCD(first,second));
    
    }
    public static int GCD(int first,int second){
        if(second==0)
            return first;
        else return GCD(second,first%second);
    }
}
