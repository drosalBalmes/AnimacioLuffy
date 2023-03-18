package org.example;

import processing.core.PImage;

import java.awt.*;
import java.util.ArrayList;

public class Animacio extends ObjecteGrafic implements Movible{

    PImage img;
    int velocitatX;
    int velocitatY;
    int i = 0;
    Boolean b;
    ArrayList<PImage> caminaList = new ArrayList<>();
    ArrayList<PImage> morList = new ArrayList<>();

    public Animacio(Color color, Point centro, ArrayList<PImage> caminaList, ArrayList<PImage> morList) {
        super(color, centro);
        this.caminaList = caminaList;
        this.morList = morList;
    }


    public void choca(Main finestra){
        if (getCentro().x + 80 == finestra.width){
            setVelocitat(velocitatX * -1,velocitatY * -1);
        }
        if (getCentro().x <= 0){
            setVelocitat(velocitatX*-1,velocitatY*-1);
        }
    }
    public void pinta(Main finestra,boolean b){
        this.b = b;
        if (b){
            finestra.image(caminaList.get(i),getCentro().x,getCentro().y,80,80);
        } else {
            finestra.image(morList.get(i),getCentro().x,getCentro().y,80,80);
        }
        i++;
        if (i ==2) i = 0;
    }

    public void setup(){
        //Sprite camina1 = new Sprite(Color.red,getCentro(), caminaList.get(0).getImg());
        //Sprite camina2 = new Sprite(Color.red,getCentro(), caminaList.get(1).getImg());
        //caminaList.add(camina1);
        //caminaList.add(camina2);


        //Sprite mor1 = new Sprite(Color.red,getCentro(),morList.get(0).getImg());
        //Sprite mor2 = new Sprite(Color.red,getCentro(),morList.get(1).getImg());
        //morList.add(mor1);
        //morList.add(mor2);
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
