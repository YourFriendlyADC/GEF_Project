package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
//        Scanner sc = new Scanner(System.in);
//        // Temperatura, Frecuencia, Amplitud de Desplazamiento, Densidad.
//        int temp, frec, ampd_desp, densidad;
//        int n;
//        // Nombre de Usuario.
//        String usuario[][] = new String[5][100];
//        System.out.print("Numero de usuarios: ");
//        n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 5; j++) {
//                switch (j) {
//                    case 0:
//                        System.out.print("Digite su nombre: ");
//                        usuario[i][j] = sc.next();
//                        break;
//                    case 1:
//                        System.out.print("Digite la temperatura (10-37) Grados Celsius: ");
//                        usuario[i][j] = Integer.toString(temp = sc.nextInt());
//                        while (temp < 10 || temp > 37) {
//                            System.out.println("La temperatura debe ser entre 10 y 37 grados: ");
//                            System.out.print("Digitela de nuevo: ");
//                            usuario[i][j] = Integer.toString(temp = sc.nextInt());
//                        }
//                        break;
//                    case 2:
//                        System.out.print("Digite la frecuencia (20-20000)Hz: ");
//                        usuario[i][j] = Integer.toString(frec = sc.nextInt());
//                        while (frec < 20 || frec > 20000) {
//                            System.out.println("La frecuencia debe ser entre 20Hz y 20000Hz: ");
//                            System.out.print("Digitela de nuevo: ");
//                            usuario[i][j] = Integer.toString(frec = sc.nextInt());
//                        }
//                        break;
//                    case 3:
//                        System.out.print("Digite la Amplitud de Desplazamiento: ");
//                        usuario[i][j] = Integer.toString(ampd_desp = sc.nextInt());                       
//                        break;
//                    case 4:
//                        System.out.println("Densidad");
//                        System.out.println("");
//                        break;
//                }
//            }            
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(usuario[i][j]);
//            }
//            System.out.println("");
//        }
    }

    @Override
    public void draw() {
        PImage bgd, ear;
        bgd = loadImage("images/bgd.png");
        ear = loadImage("images/ear.png");
        background(bgd);

        fill(0);
//        line(0, 240, 640, 240);
//        line(320, 0, 320, 480);

        fill(179, 95, 44);
        // Lineas
        line(0, 10, 630, 10);
        line(630, 0, 630, 470);
        line(640, 470, 10, 470);
        line(10, 480, 10, 10);
        // Titulo
        rect(195, 40, 250, 60);
        // Icono
        rect(153, 163, 153, 153);
        // "Nombre"
        rect(360, 200, 140, 25);
        // Nombre
        rect(340, 240, 180, 40);

        fill(255);
        image(ear, 155, 165, 150, 150);
        
    }

    public void run() {
        String[] processingArgs = {this.getClass().getName()};
        PApplet.runSketch(processingArgs, this);
    }
}
