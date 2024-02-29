package models;

public class Cube extends Solid{

    private int a;

    public Cube(int a){
        this.a = a;
    }
    @Override
    public double getSurfaceArea(){
        double result = 4 * Math.pow(this.a, 2);
        return result;
    }
}
