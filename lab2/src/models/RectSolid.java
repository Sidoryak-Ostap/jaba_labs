package models;

public class RectSolid extends Solid{

    private int c;
    private int d;
    private int h;

    public RectSolid(int c, int d, int h){
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double getSurfaceArea(){
        double result = 2*(this.c*this.d+this.c*this.h+this.d*this.h);
        return result;
    }
}
