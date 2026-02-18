import java.util.Scanner;

public class reversarray {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int [] arr=Arrayutility.inputArray();
    reverse(arr);
    System.out.println("Your reversed number is ");
    Arrayutility.displayarray(arr);
   } 
   public static void reverse(int[] arr){
    int i=0;
    while(i<arr.length/2){
        int swap=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=swap;
        i++;
    }
   }
}
