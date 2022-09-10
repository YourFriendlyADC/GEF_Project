package game;

import java.util.Scanner;
import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        Scanner sc = new Scanner(System.in);
        // Temperatura, Frecuencia, Amplitud de Desplazamiento, Densidad.
        int temp, frec, ampd_desp, densidad;
        String usuario[] = new String[5];
        for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0: // Nombre de Usuario.
                        System.out.print("Digite su nombre: ");
                        usuario[i] = sc.next();
                        break;
                    case 1:
                        System.out.print("Digite la temperatura (10-37) Grados Celsius: ");
                        usuario[i] = Integer.toString(temp = sc.nextInt());
                        while (temp < 10 || temp > 37) {
                            System.out.println("La temperatura debe ser entre 10 y 37 grados: ");
                            System.out.print("Digitela de nuevo: ");
                            usuario[i] = Integer.toString(temp = sc.nextInt());
                        }
                        break;
                    case 2:
                        System.out.print("Digite la frecuencia (20-20000)Hz: ");
                        usuario[i] = Integer.toString(frec = sc.nextInt());
                        while (frec < 20 || frec > 20000) {
                            System.out.println("La frecuencia debe ser entre 20Hz y 20000Hz: ");
                            System.out.print("Digitela de nuevo: ");
                            usuario[i] = Integer.toString(frec = sc.nextInt());
                        }
                        break;
                    case 3:
                        System.out.print("Digite la Amplitud de Desplazamiento: ");
                        usuario[i] = Integer.toString(ampd_desp = sc.nextInt());                       
                        break;
                    case 4:
                        System.out.println("Densidad");
                        break;
                }            
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
                System.out.println(usuario[i]);
            }
            System.out.println("");
    }

    int red_darker_rectX = 100, red_mid_recY = 195, red_lighter_rectY = 335, red_mid_recX = 100;
    int green_darker_rectX = 270, green_lighter_rectX = 270, green_darker_rectY = 45, green_lighter_rectY = 335;
    int blue_darker_rectY = 45, blue_mid_rectY = 195, blue_darker_rectX = 440, blue_mid_rectX = 440;
    int grados = 0;
    @Override
    public void draw() {
        PImage img;
        img = loadImage("images/background.png");
        background(img);
//        background(238, 195, 255);        
        
        fill(185, 19, 44); // Red rectangles
        rect(red_darker_rectX, 45, 100, 100); // Top
        fill(237, 82, 105);
        rect(red_mid_recX, red_mid_recY, 100, 100); // Middle
        fill(277, 162, 185);
        rect(100, red_lighter_rectY, 100, 100); // Bottom
        red_darker_rectX++; // first rectangle change of position
        if (red_darker_rectX == 440) {
            red_darker_rectX--;
        }
        red_mid_recY--;
        if (red_mid_recY == 45) {
            red_mid_recY++;
            red_mid_recX++;
            if (red_mid_recX == 270) {
                red_mid_recX--;
            }
        }
        red_lighter_rectY--;
        if (red_lighter_rectY == 45) {
            red_lighter_rectY++;
        }

        fill(58, 146, 94); // Green rectangles
        rect(green_darker_rectX, green_darker_rectY, 100, 100); // Top
        fill(119, 200, 151);
        rect(270, 195, 100, 100); // Middle
        fill(159, 243, 191);
        rect(green_lighter_rectX, green_lighter_rectY, 100, 100); // Bottom
        green_darker_rectX++;
        if (green_darker_rectX == 440) {
            green_darker_rectX--;
            green_darker_rectY++;
            if (green_darker_rectY == 195) {
                green_darker_rectY--;
            }
        }
        green_lighter_rectX--;
        if (green_lighter_rectX == 100) {
            green_lighter_rectX++;
            green_lighter_rectY--;
            if (green_lighter_rectY == 195) {
                green_lighter_rectY++;
            }
        }      

        fill(11, 60, 191); // Blue rectangles
        rect(440, blue_darker_rectY, 100, 100); // Top
        fill(72, 119, 244);
        rect(blue_mid_rectX, blue_mid_rectY, 100, 100); // Middle
        fill(142, 169, 284);
        rect(blue_darker_rectX, 335, 100, 100); // Bottom
        blue_darker_rectY++;
        if (blue_darker_rectY == 335) {
            blue_darker_rectY--;
        }
        blue_mid_rectY++;
        if (blue_mid_rectY == 335) {
            blue_mid_rectY--;
            blue_mid_rectX--;
            if (blue_mid_rectX == 270) {
                blue_mid_rectX++;
            }
        }
        blue_darker_rectX--;
        if (blue_darker_rectX == 100) {
            blue_darker_rectX++;
        }

//        line(100, 45, 100, 435); // Left
//        line(540, 45, 540, 435); // Right
//        line(100, 45, 540, 45); // Top
//        line(100, 435, 540, 435); // Bottom
    }

    public void run() {
        String[] processingArgs = {this.getClass().getName()};
        PApplet.runSketch(processingArgs, this);
    }
}
