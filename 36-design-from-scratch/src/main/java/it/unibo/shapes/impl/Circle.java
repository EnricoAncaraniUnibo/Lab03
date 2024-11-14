package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;

public class Circle implements Shape{
    private final double raggio;
    private final static double PI_GRECO = Math.PI;

    public Circle(double raggio) {
        this.raggio=raggio;
    }

    @Override
    public double calcolaArea() {
        return raggio*raggio*PI_GRECO;
    }

    @Override
    public double calcolaPerimetro() {
        return 2*PI_GRECO*raggio;
    }
    
}
