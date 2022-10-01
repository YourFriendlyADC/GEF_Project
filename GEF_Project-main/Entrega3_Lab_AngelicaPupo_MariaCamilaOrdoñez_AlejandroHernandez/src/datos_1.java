
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Victor1
 */
public class datos_1 extends javax.swing.JFrame {

    String user;
    public static String densidad = "";

    /**
     * Creates new form datos_1
     */
    public datos_1(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        String user_c;
        user_c = user.substring(0, 1).toUpperCase();
        user = user_c + user.substring(1, user.length());
        saludo.setText("Hola, " + user + "!");
        saludo.setBounds(250, 20, 300, 40);
        panel_datos_1.add(saludo);
        
        ingrese_la_temperatura.setBounds(40, 100, 180, 30);
        panel_datos_1.add(ingrese_la_temperatura);
        temperatura_rango.setBounds(70, 120, 140, 30);
        panel_datos_1.add(temperatura_rango);
        temperatura.setBounds(85, 150, 70, 30);
        panel_datos_1.add(temperatura);
        
        separador_1.setBounds(10, 220, 600, 10);
        panel_datos_1.add(separador_1);
        
        ingrese_la_frecuencia.setBounds(420, 280, 180, 30);
        panel_datos_1.add(ingrese_la_frecuencia);
        frecuencia_rango.setBounds(460, 300, 100, 30);
        panel_datos_1.add(frecuencia_rango);
        frecuencia.setBounds(450, 330, 80, 30);
        panel_datos_1.add(frecuencia);
        
        separador_2.setBounds(10, 430, 600, 10);
        panel_datos_1.add(separador_2);
        
        ingrese_longitud.setBounds(210, 470, 200, 30);
        panel_datos_1.add(ingrese_longitud);
        longitud.setBounds(270, 510, 80, 30);
        panel_datos_1.add(longitud);
        
        atras.setBounds(20, 595, 60, 30);
        panel_datos_1.add(atras);
        to_datos_2.setBounds(260, 590, 100, 35);
        panel_datos_1.add(to_datos_2);
        
        this.setTitle("Introducir datos");
        
        ImageIcon img2 = new ImageIcon("images/icon_perezoso_1.png");
        setIconImage(img2.getImage());

    }

    private datos_1() { // This works actually. Don't delete.
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_datos_1 = new javax.swing.JPanel();
        saludo = new javax.swing.JLabel();
        ingrese_la_temperatura = new javax.swing.JLabel();
        temperatura = new javax.swing.JTextField();
        temperatura_rango = new javax.swing.JLabel();
        ingrese_la_frecuencia = new javax.swing.JLabel();
        frecuencia = new javax.swing.JTextField();
        frecuencia_rango = new javax.swing.JLabel();
        to_datos_2 = new javax.swing.JButton();
        separador_1 = new javax.swing.JSeparator();
        aviso = new javax.swing.JLabel();
        aviso_temp = new javax.swing.JLabel();
        aviso_1 = new javax.swing.JLabel();
        aviso_2 = new javax.swing.JLabel();
        aviso_frec = new javax.swing.JLabel();
        ingrese_longitud = new javax.swing.JLabel();
        longitud = new javax.swing.JComboBox<>();
        separador_2 = new javax.swing.JSeparator();
        aviso5 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        validacion_temp = new javax.swing.JLabel();
        validacion_frec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_datos_1.setBackground(new java.awt.Color(215, 227, 252));
        panel_datos_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        saludo.setBackground(new java.awt.Color(0, 0, 0));
        saludo.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        saludo.setForeground(new java.awt.Color(0, 0, 102));
        saludo.setText("Hola, username!");

        ingrese_la_temperatura.setBackground(new java.awt.Color(0, 0, 0));
        ingrese_la_temperatura.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        ingrese_la_temperatura.setForeground(new java.awt.Color(0, 0, 102));
        ingrese_la_temperatura.setText("Ingrese la temperatura");

        temperatura.setBackground(new java.awt.Color(237, 242, 251));
        temperatura.setForeground(new java.awt.Color(0, 0, 102));
        temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturaActionPerformed(evt);
            }
        });

        temperatura_rango.setBackground(new java.awt.Color(0, 0, 0));
        temperatura_rango.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        temperatura_rango.setForeground(new java.awt.Color(0, 0, 102));
        temperatura_rango.setText("10-37 Grados Celsius");

        ingrese_la_frecuencia.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        ingrese_la_frecuencia.setForeground(new java.awt.Color(0, 0, 102));
        ingrese_la_frecuencia.setText("Ingrese la frecuencia");

        frecuencia.setBackground(new java.awt.Color(237, 242, 251));
        frecuencia.setForeground(new java.awt.Color(0, 0, 102));
        frecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecuenciaActionPerformed(evt);
            }
        });

        frecuencia_rango.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        frecuencia_rango.setForeground(new java.awt.Color(0, 0, 102));
        frecuencia_rango.setText("20-2000 Hz");

        to_datos_2.setBackground(new java.awt.Color(118, 158, 219));
        to_datos_2.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        to_datos_2.setForeground(new java.awt.Color(255, 255, 255));
        to_datos_2.setText("Introducir");
        to_datos_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_datos_2ActionPerformed(evt);
            }
        });

        separador_1.setBackground(new java.awt.Color(51, 153, 255));
        separador_1.setForeground(new java.awt.Color(0, 102, 255));

        aviso.setBackground(new java.awt.Color(255, 51, 51));
        aviso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        aviso_temp.setForeground(new java.awt.Color(204, 0, 51));

        aviso_frec.setForeground(new java.awt.Color(204, 0, 51));

        ingrese_longitud.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        ingrese_longitud.setForeground(new java.awt.Color(0, 0, 102));
        ingrese_longitud.setText("Ingrese Longitud de Onda");

        longitud.setBackground(new java.awt.Color(204, 204, 204));
        longitud.setEditable(true);
        longitud.setForeground(new java.awt.Color(51, 51, 51));
        longitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.1 x 10^-8", "0.2 x 10^-8", "0.3 x 10^-8", "0.4 x 10^-8", "0.5 x 10^-8", "0.6 x 10^-8", "0.7 x 10^-8", "0.8 x 10^-8", "0.9 x 10^-8", "1 x 10^-8", "1.1 x 10^-8", "1.2 x 10^-8", "1.3 x 10^-8", "1.4 x 10^-8", "1.5 x 10^-8", "1.6 x 10^-8", "1.7 x 10^-8", "1.8 x 10^-8", "1.9 x 10^-8", "2 x 10^-8" }));
        longitud.setAutoscrolls(true);
        longitud.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        longitud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        longitud.setName("Rango"); // NOI18N
        longitud.setOpaque(true);

        separador_2.setBackground(new java.awt.Color(51, 153, 255));
        separador_2.setForeground(new java.awt.Color(0, 102, 255));

        atras.setBackground(new java.awt.Color(118, 158, 219));
        atras.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        validacion_temp.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        validacion_temp.setForeground(new java.awt.Color(255, 0, 0));

        validacion_frec.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        validacion_frec.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panel_datos_1Layout = new javax.swing.GroupLayout(panel_datos_1);
        panel_datos_1.setLayout(panel_datos_1Layout);
        panel_datos_1Layout.setHorizontalGroup(
            panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_1Layout.createSequentialGroup()
                        .addComponent(aviso_2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_1Layout.createSequentialGroup()
                        .addComponent(aviso_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validacion_temp)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_1Layout.createSequentialGroup()
                        .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_datos_1Layout.createSequentialGroup()
                                .addComponent(atras)
                                .addGap(195, 195, 195)
                                .addComponent(to_datos_2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(272, 272, 272))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_1Layout.createSequentialGroup()
                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(aviso_1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(ingrese_longitud)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(separador_2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_1Layout.createSequentialGroup()
                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ingrese_la_temperatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aviso5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(312, 312, 312))
            .addGroup(panel_datos_1Layout.createSequentialGroup()
                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(ingrese_la_frecuencia))
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_1Layout.createSequentialGroup()
                                .addComponent(frecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(validacion_frec)
                                .addGap(338, 338, 338)
                                .addComponent(aviso_frec, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(frecuencia_rango)))
                    .addComponent(separador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temperatura_rango)))
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(saludo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_datos_1Layout.setVerticalGroup(
            panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saludo)
                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aviso5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ingrese_la_temperatura)
                        .addGap(18, 18, 18)
                        .addComponent(temperatura_rango)
                        .addGap(15, 15, 15)))
                .addComponent(aviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(aviso_temp)
                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(validacion_temp)
                        .addGap(30, 30, 30)
                        .addComponent(separador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(ingrese_la_frecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(aviso_frec))
                            .addGroup(panel_datos_1Layout.createSequentialGroup()
                                .addComponent(frecuencia_rango)
                                .addGap(18, 18, 18)
                                .addComponent(frecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(validacion_frec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(separador_2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingrese_longitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aviso_1)
                            .addGroup(panel_datos_1Layout.createSequentialGroup()
                                .addGroup(panel_datos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                                        .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(atras))
                                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(to_datos_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80)
                                .addComponent(aviso_2)))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(panel_datos_1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_datos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_datos_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void to_datos_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_datos_2ActionPerformed
        datos_2 d_2 = new datos_2();
        int temp, frec;
        double densidad, r = 286.9, p = 101325, k; // p: 1 atm a pascales, r:  Constante individual del gas, k: numero de ondas
        boolean pass_t = false, pass_f = false;
        String density = "";

        // Temperatura
        temp = Integer.parseInt(temperatura.getText());
        densidad = p / (r * (temp + 273.15));
        density = Double.toString(densidad);

        // Velocidad de sonido
        double vs = 331.4;
        vs = vs + (temp * 0.6);

        // Validación Temperature
        if (temp > 9 && temp < 38) {
            pass_t = true;
        } else {
            validacion_temp.setText("Digite un valor entre el rango indicado.");
            validacion_temp.setBounds(30, 190, 300, 20);            
            panel_datos_1.add(validacion_temp);
        }

        // Frecuency
        frec = Integer.parseInt(frecuencia.getText());

        // Número de ondas
        k = (2 * pi() * frec) / vs;

        // Validación Frecuencia
        if (frec > 19 && frec < 2001) {          
            pass_f = true;
        } else {
            validacion_frec.setText("Digite un valor entre el rango indicado.");
            validacion_frec.setBounds(400, 370, 300, 20);
            panel_datos_1.add(validacion_frec);
        }
        
        // Validacion de ambos
        if (pass_t == true & pass_f == true) {
            this.setVisible(false);
            d_2.setVisible(true);
        } else {
            this.setVisible(true);
            d_2.setVisible(false);
        }
    }//GEN-LAST:event_to_datos_2ActionPerformed

    private void frecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecuenciaActionPerformed

    }//GEN-LAST:event_frecuenciaActionPerformed

    private void temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturaActionPerformed

    }//GEN-LAST:event_temperaturaActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.dispose();
        menu panel_menu = new menu();
        panel_menu.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel aviso5;
    private javax.swing.JLabel aviso_1;
    private javax.swing.JLabel aviso_2;
    private javax.swing.JLabel aviso_frec;
    private javax.swing.JLabel aviso_temp;
    private javax.swing.JTextField frecuencia;
    private javax.swing.JLabel frecuencia_rango;
    private javax.swing.JLabel ingrese_la_frecuencia;
    private javax.swing.JLabel ingrese_la_temperatura;
    private javax.swing.JLabel ingrese_longitud;
    private javax.swing.JComboBox<String> longitud;
    private javax.swing.JPanel panel_datos_1;
    public static javax.swing.JLabel saludo;
    private javax.swing.JSeparator separador_1;
    private javax.swing.JSeparator separador_2;
    private javax.swing.JTextField temperatura;
    private javax.swing.JLabel temperatura_rango;
    private javax.swing.JButton to_datos_2;
    private javax.swing.JLabel validacion_frec;
    private javax.swing.JLabel validacion_temp;
    // End of variables declaration//GEN-END:variables

    private static class panel_menu {
        public panel_menu() {}
        private void setVisible(boolean b) {}
    }
    
    public static double pi() {
        int piLimit = 1000, piD = 1, signo = 1;
        double pi,  piSum = 0, piInt;
        for (int i = 1; i <= piLimit; i++) {
            piInt = (double) 1 / piD * signo;
            piSum = piSum + piInt;
            piD = piD + 2;
            signo = signo * -1;
        }
        pi = piSum * 4;        
        return pi;
    }

//    private static class density {
//
//        public density() {
//        }
//    }
}
