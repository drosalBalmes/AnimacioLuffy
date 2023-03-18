package org.example;

import java.awt.*;

public class Triangle extends ObjecteGrafic {
    Point punto1;
    Point punto2;
    Point punto3;

    public Triangle(Color color, Point centro,Point punto1,Point punto2,Point punto3) {
        super(color, centro);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    @Override
    public void pinta(Main finestra){
        finestra.fill(getColor().getRGB());
        finestra.triangle(punto1.x,punto1.y,punto2.x,punto2.y,punto3.x,punto3.y);
    }

    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void setPunto2(Point punto2) {
        this.punto2 = punto2;
    }

    public Point getPunto3() {
        return punto3;
    }

    public void setPunto3(Point punto3) {
        this.punto3 = punto3;
    }
}
