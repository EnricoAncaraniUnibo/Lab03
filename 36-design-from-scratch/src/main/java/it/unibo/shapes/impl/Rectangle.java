package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon{

    private final double latoLungo;
    private final double latoCorto;

    public Rectangle(final double latoL, final double latoC) {
        this.latoLungo = latoL;
        this.latoCorto = latoC;
    }

    @Override
    public double calcolaArea() {
        return latoCorto * latoLungo;
    }

    @Override
    public double calcolaPerimetro() {
        return latoCorto*2 + latoLungo*2;
    }

    @Override
    public int getEdgeCount() {
        return 4;
    }
    
}
