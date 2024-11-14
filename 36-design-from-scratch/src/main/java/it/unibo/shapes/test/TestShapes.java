package it.unibo.shapes.test;

import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class TestShapes {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(10, 15);
        Square s= new Square(5);
        Triangle t = new Triangle(2, 5);
        System.out.println(c.calcolaArea()+" "+c.calcolaPerimetro()+"\n");
        System.out.println(r.calcolaArea()+" "+r.calcolaPerimetro()+" "+r.getEdgeCount()+"\n");
        System.out.println(s.calcolaArea()+" "+s.calcolaPerimetro()+" "+s.getEdgeCount()+"\n");
        System.out.println(t.calcolaArea()+" "+t.calcolaPerimetro()+" "+t.getEdgeCount()+"\n");
    }
    
}
