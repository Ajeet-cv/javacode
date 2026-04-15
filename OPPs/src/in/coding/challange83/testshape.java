package in.coding.challange83;

public class testshape {
    static void main() {
        circle cicle =new circle(5);
        Square squar=new Square(10.3);

        System.out.printf("Area of circle is %f\n",cicle.calculatearea());
        System.out.printf("Area of square is %f",squar.calculatearea());

    }
}
