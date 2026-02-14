import java.util.Scanner;

public class lcm {
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter your number ");
    int first= input.nextInt();
    System.out.println("Please enter your number ");
    int second= input.nextInt();
    System.out.println("LCM of the number is:"+LCM(first,second));
    

 } 
 public static int LCM(int first,int second){
    int i=1;
    while(true){
        int factor=i*first;
        if(factor%second==0){
            return factor;
        }
        i++;
    }
 }  
}
