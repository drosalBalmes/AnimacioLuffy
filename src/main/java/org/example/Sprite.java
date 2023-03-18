package org.example;

import processing.core.PImage;

import java.awt.*;

public class Sprite extends ObjecteGrafic implements Movible {
    PImage img;
    int velocitatX;
    int velocitatY;

    public Sprite(Color color, Point posicio, PImage img) {
        super(color, posicio);
        this.img = img;
    }

    public void pinta(Main finestra){
        finestra.image(img, getCentro().x, getCentro().y,80,80);
    }

    public PImage getImg() {
        return img;
    }

    public void setImg(PImage img) {
        this.img = img;
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

    public float getVelocitatX() {
        return velocitatX;
    }

    public float getVelocitatY() {
        return velocitatY;
    }

}
