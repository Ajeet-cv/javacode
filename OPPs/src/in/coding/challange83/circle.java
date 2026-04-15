package in.coding.challange83;

public  class circle extends Shape{
    private  final double radiusincm;
    public circle (double radiusincm){
        this.radiusincm=radiusincm;
    }
    public double getradiusincm(){
        return radiusincm;
    }

    @Override
    public  double calculatearea() {
        return Math.PI*Math.pow(radiusincm,2);
    }
}
