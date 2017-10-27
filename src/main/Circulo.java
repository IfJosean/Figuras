package main;

/**
 * Created by Josean on 18/09/2017.
 */
public class Circulo extends Figura
{
    private double radio;

    public Circulo(double radio)
    {
        this.radio = radio;
    }
    public double area()
    {
        return PI*radio*radio;
    }
}