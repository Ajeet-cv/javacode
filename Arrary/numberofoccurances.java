import java.util.Scanner;

public class numberofoccurances {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculate no of occurance in array");
        System.out.println("Enter the size of array");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements ");
        int i=0;
        while(i<arr.length){
            arr[i]=input.nextInt();
            i++;
        }
        System.out.println("Now,enter the number you want to find:");
        int num=input.nextInt();
       int occ=occurance(arr,num);
       System.out.println("Your element was found "+occ+" times in the array");

    }
    public static int occurance(int[] array,int num){
        int i=0;
        int occ=0;
        while(i<array.length){
            if(array[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
