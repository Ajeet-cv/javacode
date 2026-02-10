import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("wlecome to new year calculator :");
        System.out.println("Please enter the year that you want to check: ");
        int year=input.nextInt();
    if(year%400==0){
        System.out.println("Your year is leap year");
    }
else if(year%100==0){
    System.out.println("Your year is not leap year");
}
else if(year%4==0){
    System.out.println("Your year is leap year" );
}
else{
    System.out.println("Your year not leap year");
}


    }
}
