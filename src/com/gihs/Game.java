package com.gihs;

import processing.core.*;

public class Game extends PApplet {

    public void setup() {
        size(200, 200);
        if (frame != null) {
            frame.setResizable(true);
        }
        background(0);
    }

    public void draw() {
        stroke(255);
        if (mousePressed && (mouseButton == LEFT)) {
            line(mouseX, mouseY, pmouseX, pmouseY);
        } else if (mousePressed && (mouseButton == RIGHT)) {
            background(0);
        }
    }
}