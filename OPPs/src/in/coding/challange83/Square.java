package in.coding.challange83;

public class Square extends Shape{
    private final double sideincm;

    public Square(double sideincm) {
        this.sideincm = sideincm;
    }

    public double getSideincm() {
        return sideincm;
    }

    @Override
    public  double calculatearea() {
        return sideincm*sideincm ;
    }
}
