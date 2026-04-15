package in.coding.challenge77;

import in.coding.challenge77.geometry.Rectangle;
import in.coding.challenge77.geometry.circle;

public class Calculator {
    static void main() {
        circle cir=new circle(5.5);
        Rectangle rect= new Rectangle(10,5);
        double cirArea=Math.PI*Math.pow(cir.radius,2);
        double rectArea=rect.breadth*rect.length;
        System.out.printf("Area of the circle is: %f, Area of the rectangle is: %f" ,cirArea,rectArea);

    }
}
