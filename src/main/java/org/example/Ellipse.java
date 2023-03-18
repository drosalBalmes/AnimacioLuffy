package org.example;

import java.awt.*;

public class Ellipse extends ObjecteGrafic {
    private float radiY;
    private float radiX;


    public Ellipse(Color color, Point centro,float radiY,float radiX) {
        super(color, centro);
        this.radiX = radiX;
        this.radiY = radiY;
    }

    @Override
    public void pinta(Main finestra){
        finestra.fill(getColor().getRGB());
        finestra.ellipse(getCentro().x,getCentro().y,radiX,radiY);
    }

    public float getRadiY() {
        return radiY;
    }

    public void setRadiY(float radiY) {
        this.radiY = radiY;
    }

    public float getRadiX() {
        return radiX;
    }

    public void setRadiX(float radiX) {
        this.radiX = radiX;
    }
}
