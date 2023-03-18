package org.example;

import java.awt.*;

public class ObjecteGrafic implements Movible {
    private Color color;
    private Point centro;
    int velocitatX;
    int velocitatY;

    public ObjecteGrafic(Color color, Point centro) {
        this.color = color;
        this.centro = centro;
    }

    public void pinta(Main finestra){}

    public Color getColor() {
        return color;
    }

    public Point getCentro() {
        return centro;
    }

    public void setPos(Point centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + ", centro=" + centro + '}';
    }

    @Override
    public void mou() {
        setPos(new Point(getCentro().x+velocitatX,getCentro().y+velocitatY));
    }

    @Override
    public void setVelocitat(int x, int y) {
        velocitatX = x;
        velocitatY = y;
    }
}
