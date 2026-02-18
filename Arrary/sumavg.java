public class sumavg {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and average");
        int[] numarray= Arrayutility.inputArray();
        long sum=sum(numarray);
        long avg=average(numarray);
        System.out.println("Sum of the array is "+sum);
        System.out.println("Average of this array "+avg);

    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] numarray){
        long sum=sum(numarray);
        return (int)(sum/numarray.length);
    }
}
