package main;

/**
 * Created by Josean on 18/09/2017.
 */
public class Cuadrado extends Figura
{
    private double lado;
    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    public double area()
    {
        return lado*lado;
    }

}