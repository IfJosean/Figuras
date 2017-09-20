package main;

/**
 * Created by Josean on 18/09/2017.
 */
public class Triangulo extends Figura {

    double b, h;

    public Triangulo (double b, double h){

        this.b = b;
        this.h = h;
    }

    public double area () {

        return (this.b*this.h)/2;
    }

}
