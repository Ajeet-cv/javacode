public class checksorted {
   public static void main(String[] args) {
    System.out.println("Welcome to array sorting check post");
    int[] arr=Arrayutility.inputArray();
    boolean inc=isincresing(arr);
    boolean dec=isdecresing( arr);
    if(inc||dec){
        System.out.println("Your array is sorted");
    }
    else{
        System.out.println("Your array is not sorted");
    }
   } 
   public static boolean isincresing(int[] arr){
    int i=1;
    if(arr.length==1){
        return true;
    }
    while(i<arr.length){
     if(arr[i]<arr[i-1]){
        return false;
     }
     i++;
    }
    return true;
   }
   public static boolean isdecresing(int[] arr){
    int i=1;
    if(arr.length==1){
        return true;
    }
    while(i<arr.length){
     if(arr[i]>arr[i-1]){
        return false;
     }
     i++;
    }
    return true;
   }
}
