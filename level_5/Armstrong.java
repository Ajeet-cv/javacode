import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome  in armstrong calculator");
       System.out.println("Please enter your number to be check");
       int num=input.nextInt();
       if(isarmstrong(num)){
        System.out.println("Yes,Number is armstrong ");
       }
       else{
        System.out.println("No,number is not armstrong");
       }
       

    }
    public static boolean isarmstrong(int num){
        int n=num;
        long sum=0;
        while(num>0){
         int digit=num%10;
          sum+=digit*digit*digit;
          num=num/10;
        }
        if(sum==n)
            return true;
        return false;

    }
}
