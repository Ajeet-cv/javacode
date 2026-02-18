/*
  Name-> Ajeet Chaurasiya
  Section-> CSE 11
  Roll no.-> 2400320100111
  
  
  WAP to print add of two matrices in java.
  */
import java.util.Scanner;

public class addmatrix {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of row: ");
        int n=input.nextInt();
        System.out.println("Enter the no of coloum: ");
        int m=input.nextInt();
        System.out.println("Enter the element of matrix 1: ");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            System.out.print("|");
          for(int j=0;j<m;j++){
            arr[i][j]= input.nextInt();
          }

        }
        System.out.println("Enter the element of matrix 2: ");
        int ar[][]=new int[n][m];
        for(int i=0;i<n;i++){
           System.out.print("|");
          for(int j=0;j<m;j++){
            ar[i][j]= input.nextInt();
          }

        }
        int ans[][]=new int[n][m];
        System.out.println("Add of matrix 1 and matrix 2:=> ");
        for(int i=0;i<n;i++){
            System.out.print("|");
          for(int j=0;j<m;j++){
            ans[i][j]= ar[i][j] +arr[i][j];
            System.out.print(ans[i][j]+ " ");
          }
          System.out.print("|");
          System.out.println();
        }
    }
}
/*       OUTPUT

  Enter the no of row: 
3 
Enter the no of coloum: 
3
Enter the element of matrix 1: 
|2 3 4
|2 3 4
|4 3 2
Enter the element of matrix 2: 
|2 3 4
|2 3 4
|5 4 3
Add of matrix 1 and matrix 2:=> 
|4 6 8 |
|4 6 8 |
|9 7 5 |
PS C:\Users\Ajeet Chaurasiya\OneDrive\Desktop\javacode\college labs experiment>
*/
