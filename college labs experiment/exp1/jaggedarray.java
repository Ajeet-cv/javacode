/*  Write a program in Java which creates the variable size array (Jagged Array) and print all the values using loop statement.
 */

import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[]{1,2};
        arr[1] = new int[]{3,4,5};
        arr[2] = new int[]{6,7,8,9};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*      OUTPUT
    1 2 
3 4 5 
6 7 8 9 
PS C:\Users\Ajeet Chaurasiya\OneDrive\Desktop\javacode\college labs experiment\exp1> 
 */
