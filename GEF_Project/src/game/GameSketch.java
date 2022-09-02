package game;

import processing.core.PApplet;

public class GameSketch extends PApplet{


    @Override
    public void settings() {
        size(500, 500);        
    }
    
    int size_1 = 150, size_2 = 120, size_3 = 80;
    @Override
    public void setup() {
        background(255, 192, 235);
        fill(135, 206, 250);
    }

    @Override
    public void draw() {
        ellipse(250,250,size_1,size_1);
        ellipse(250,250,size_2,size_2);
        ellipse(250,250,size_3,size_3);
        size_1++;
        size_2++;
        size_3++;
        if (size_1 >= width) {
            while (size_1 != 0) {
                size_1--;
            }
        }
        if (size_2 >= width) {
            while (size_2 != 0) {
                size_2--;
            }
        }
        if (size_3 >= width) {
            while (size_3 != 0) {
                size_3--;
            }
        }
    }

    public void run() {
        String[] processingArgs = { this.getClass().getName() };
        PApplet.runSketch(processingArgs, this);
    }
}
