import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the no of row");
        int row=input.nextInt();
        int r=row;
        while(row>0){
            int j=1;
            while(j<row){
                System.out.print("  ");
                j++;
            }
            int i=0;
            while(i<r-j){
                System.out.print("* ");
                i++;
            }
            System.out.println();
          
            row--;
        }
    }
}
