package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.ArrayList;

public class Main extends PApplet {
    Point pointCircle = new Point(600, 300);
    Point pointEllipse = new Point(400, 400);
    Point pointImg = new Point(350, 150);
    Point pointTriangleCenter = new Point(200, 400);
    Point pointTriangle1 = new Point(100, 100);
    Point pointTriangle2 = new Point(50, 150);
    Point pointTriangle3 = new Point(150, 150);
    Ellipse ellipse = new Ellipse(Color.pink, pointEllipse, 90, 120);
    Cercle cercle = new Cercle(Color.red, pointCircle, 100);
    Triangle triangle = new Triangle(Color.green, pointTriangleCenter, pointTriangle1, pointTriangle2, pointTriangle3);
    PImage imgAndar1;
    PImage imgAndar2;
    PImage imgMor1;
    PImage imgMor2;
    Animacio animacio;

    int i = 0;
    Boolean listB = true;
    ArrayList<PImage> andarList = new ArrayList<>();
    ArrayList<PImage> morList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.runSketch(new String[]{"aa"}, main);

    }

    public void settings() {
        size(700, 700);
    }

    @Override
    public void keyPressed() {
        if (key == ' ') {
            listB = !listB;

            if (listB){
                animacio.setVelocitat(5,0);
            } else {
                animacio.setVelocitat(0,0);
            }
        }
    }
    public void setup() {
        background(0);
        imgAndar1 = loadImage("sprite_luffy_run.png");
        imgAndar2 = loadImage("luffy_run_dos.png");
        imgMor1 = loadImage("sprite_luffy_run.png");
        imgMor2 = loadImage("luffy_dead.png");
        andarList.add(imgAndar1);
        andarList.add(imgAndar2);
        morList.add(imgMor1);
        morList.add(imgMor2);
        animacio = new Animacio(Color.red, pointImg,andarList,morList);
        animacio.setVelocitat(5,0);
        cercle.pinta(this);
        ellipse.pinta(this);
        triangle.pinta(this);
    }

    public void draw() {
        background(0);
        animacio.pinta(this,listB);
        animacio.choca(this);
        animacio.mou();
        //Sprite dibujito = andarList.get(i);
        //dibujito.pinta(this);
        //dibujito.setVelocitat(10,0);
        //dibujito.mou();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}