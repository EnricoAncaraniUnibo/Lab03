package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon{
    private final double latoBase;
    private final double altezza;
    private final double latoCateto;
    private final double latoIpotenusa;

    public Triangle(final double latoB, final double h, final double lC, final double lI) {
        this.latoBase = latoB;
        this.altezza = h;
        this.latoCateto = lC;
        this.latoIpotenusa = lI;
    }

    public Triangle(final double latoB, final double h) {
        this(latoB, h, latoB, latoB);
    }

    public Triangle(final double latoB, final double h, final double latoIsoscele) {
        this(latoB, h, latoIsoscele, latoIsoscele);
    }

    @Override
    public double calcolaArea() {
        return latoBase*altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return latoBase+latoCateto+latoIpotenusa;
    }

    @Override
    public int getEdgeCount() {
        return 3;
    }
    
}
