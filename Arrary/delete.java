import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcom to array Deletion");
        int [] arr=Arrayutility.inputArray();
        System.out.println("Now, enter then number you want to delete: ");
        int numtodelet=input.nextInt();
        int[] newarr=deletNumber(arr,numtodelet);
        System.out.println("Here is your new array");
        Arrayutility.displayarray(newarr);
    }
    public static int[] deletNumber(int[] arr,int num){
        int i=0;
        int j=0;
        int occ=0;
        while(i<arr.length){
            if(arr[i]==num){
                occ++;
            }
            i++;
        }
        int[] newarr=new int[arr.length-occ];
          i=0;
        while(i<arr.length){
            if(arr[i]!=num){
                newarr[j]=arr[i];
                j++;
            }
          i++; 
          }
      return newarr;
    }
}
