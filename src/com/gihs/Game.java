package com.gihs;

import processing.core.*;

public class Game extends PApplet {

    public void setup() {
        size(200,200);
        background(0);
    }

    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX,mouseY,pmouseX,pmouseY);
        }
    }
}