package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

    @Override
    public void settings() {
        size(500, 500);
    }

    int size_1 = 10;

    @Override
    public void setup() {
//       fill(135, 206, 250);
    }

    @Override
    public void draw() {
        PImage img;
        img = loadImage("images/spidey.png");
        background(img);
        rect(0, 0, 499, size_1);
        size_1+=2;
    }

    public void run() {
        String[] processingArgs = {this.getClass().getName()};
        PApplet.runSketch(processingArgs, this);
    }
}
