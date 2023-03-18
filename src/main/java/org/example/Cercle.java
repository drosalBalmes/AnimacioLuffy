package org.example;

import java.awt.*;

public class Cercle extends ObjecteGrafic {
    private float radi;
    private float area;


    public Cercle(Color color, Point centro, float radi) {
        super(color, centro);
        this.radi = radi;
    }

    @Override
    public void pinta(Main finestra){
        finestra.fill(getColor().getRGB());
        finestra.ellipse(getCentro().x,getCentro().y,radi,radi);
    }
}
