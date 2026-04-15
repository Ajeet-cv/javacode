package in.coding.challenge82;

public class Arrayoperations {
    private int[] numbers;

    public Arrayoperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            long sum=0;
            for(int number:numbers){
                sum+=number;
            }
            return sum/numbers.length;
        }
        double median(){
            return 0;
        }
    }

}
