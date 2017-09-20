package main;

/**
 * Created by Josean on 18/09/2017.
 */
public class Rectangulo extends Figura {

    double l1, l2;

    public Rectangulo (double l1, double l2){

        this.l1 = l1;
        this.l2 = l2;
    }

    public double area () {

        return this.l1*this.l2
    }
}
