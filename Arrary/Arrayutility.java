import java.util.Scanner;

public class Arrayutility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of elements: ");
        int size=input.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Please enter element no of "+(i+1)+" =>");
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayarray(int[] arr){
        Scanner input =new Scanner(System.in);
       int i=0;
       while(i<arr.length){
         System.out.print(arr[i]+" ");
        i++;
       }
       System.out.println();
    }
}
