public class parameters {
    public static void main(String[] args) {
     System.out.println(sumnumbers(4,5));
     System.out.println(sumnumbers(-4,5));
     System.out.println(sumnumbers(-4,-5));   
    }
    public static int sumnumbers( int first, int second){
        System.out.println("Enter your first number :"+first);
        System.out.println("Enter your second number:"+second);
        return first+second;
    }
}
