package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon{
    private final double lato;

    public Square(final int lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaArea() {
        return lato*lato;
    }

    @Override
    public double calcolaPerimetro() {
        return 4*lato;
    }

    @Override
    public int getEdgeCount() {
        return 4;
    }
    
}
