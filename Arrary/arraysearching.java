//package Arrary;

import java.util.Scanner;

public class arraysearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //int[] myarr=new int[10];
        int [] myarr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Welcome to array searching");
        System.out.println("Enter the number to be search: ");
        int num=input.nextInt();
        if(isfound(myarr,num)){
            System.out.println("True,number is found");
        }
        else{
            System.out.println("False, number is not found");
        }
        
    }
    public static boolean isfound(int[] myarr,int n){
        int i=0;
        while(i < myarr.length){
           if(myarr[i]==n)
            return true;
        i++;
        }
        return false;
    }

}
