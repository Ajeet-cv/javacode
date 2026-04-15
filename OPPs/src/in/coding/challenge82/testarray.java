package in.coding.challenge82;

public class testarray {
    static void main() {
        Arrayoperations opr= new Arrayoperations(new int[]{1,3,5,9});
        Arrayoperations.Statistics sta=opr.new Statistics();
        System.out.println(sta.mean());
    }
}
