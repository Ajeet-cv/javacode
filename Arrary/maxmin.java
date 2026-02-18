public class maxmin {
    public static void main(String[] args) {
        System.out.println("Welcome to min and max");
        int[] arr=Arrayutility.inputArray();
        int minimum=min(arr);
        int maximum=max(arr);
        System.out.println("Your minimum in the array is "+minimum);
        System.out.println("Your maximum number in the array is "+maximum);
    }
    public static int max(int[] array){
       if(array.length==0){
           return Integer.MIN_VALUE;
       } 
       int i=1;
       int max=array[0];
       while(i<array.length){
        if(max<array[i]){
            max=array[i];
        }
        i++;
       }
       return max; 
    }
     public static int min(int[] array){
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<array.length){
            if(min>array[i]){
                min=array[i];
            }
            i++;
        }
        return min;
    }
}
