
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.lang.String;
import javax.swing.JPanel;

/**
 * Victor es el nombre de mi papá, pusieron la laptop a su nombre
 * @author Victor1
 */
public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        personalizacion_ventana();
//        ImageIcon imagen = new ImageIcon("images/bg_4.png");
//        JLabel img_3 = new JLabel();
//        img_3.setBounds(0, -10, getWidth(), getHeight());
//        img_3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(640, 520, Image.SCALE_SMOOTH)));
//        panel_menu.add(img_3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu = new javax.swing.JPanel();
        to_datos_1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ingrese_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        archivos = new javax.swing.JButton();
        aviso_nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_menu.setBackground(new java.awt.Color(215, 227, 252));
        panel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_menuMouseEntered(evt);
            }
        });

        to_datos_1.setBackground(new java.awt.Color(118, 158, 219));
        to_datos_1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        to_datos_1.setForeground(new java.awt.Color(0, 0, 153));
        to_datos_1.setText("Entrar");
        to_datos_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_datos_1ActionPerformed(evt);
            }
        });
        to_datos_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                to_datos_1KeyPressed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(118, 158, 219));
        salir.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 153));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        usuario.setBackground(new java.awt.Color(241, 244, 251));
        usuario.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 102));
        usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 30, 16), 1, true));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Title TBC");

        ingrese_nombre.setBackground(new java.awt.Color(0, 0, 0));
        ingrese_nombre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ingrese_nombre.setForeground(new java.awt.Color(0, 0, 102));
        ingrese_nombre.setText("Ingrese su nombre ");

        archivos.setBackground(new java.awt.Color(118, 158, 219));
        archivos.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        archivos.setForeground(new java.awt.Color(0, 0, 153));
        archivos.setText("Archivos");
        archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivosActionPerformed(evt);
            }
        });

        aviso_nombre.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(archivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                        .addComponent(ingrese_nombre)
                        .addGap(9, 9, 9)))
                .addGap(236, 236, 236))
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aviso_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to_datos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(ingrese_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(to_datos_1)
                .addGap(25, 25, 25)
                .addComponent(aviso_nombre)
                .addGap(25, 25, 25)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(archivos))
                .addGap(16, 16, 16))
            .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void to_datos_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_datos_1ActionPerformed
        datos_1 d_1 = new datos_1(usuario.getText());
        String user = usuario.getText();
        System.out.println(user);
        if (validacion_nombre(user) == false) {
            aviso_nombre.setText("Digite un nombre.");
            aviso_nombre.setBounds(277, 430, 100, 20);
            panel_menu.add(aviso_nombre);
            this.setVisible(true);
            d_1.setVisible(false);
        } else {
            this.setVisible(false);
            d_1.setVisible(true);
        }
    }//GEN-LAST:event_to_datos_1ActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
//        int n = 1;
//        String users[][] = new String[5][100];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0) {
//                    users[i][j] = usuario.getText();
//                }
//            }
//        }
    }//GEN-LAST:event_usuarioActionPerformed

    private void panel_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_menuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_menuMouseEntered

    private void to_datos_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_to_datos_1KeyPressed
        datos_1 d_1 = new datos_1(usuario.getText());
        String user = usuario.getText();
        if (user.length() == 0)
            user = "  ";
        if (validacion_nombre(user) == false) {
            aviso_nombre.setText("Digite un nombre.");
            aviso_nombre.setBounds(277, 410, 100, 20);
            panel_menu.add(aviso_nombre);
            this.setVisible(true);
            d_1.setVisible(false);
        } else {
            this.setVisible(false);
            d_1.setVisible(true);
        }
    }//GEN-LAST:event_to_datos_1KeyPressed

    private void archivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivosActionPerformed
        this.dispose();
        archivos archs = new archivos();
        archs.setVisible(true);
    }//GEN-LAST:event_archivosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivos;
    private javax.swing.JLabel aviso_nombre;
    private javax.swing.JLabel ingrese_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JButton salir;
    public static javax.swing.JButton to_datos_1;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    public static boolean validacion_nombre(String user) {
        boolean pase = false;
        int i = 0;
        System.out.println(user);
        if (user.length() < 3) {
            pase = !("".equals(user) || " ".equals(user));
        } else {
            if (user.length() > 2) {
                while (pase == false && i < user.length()) {
                    if (!"".equals(user.substring(i, i + 1))) {
                        pase = true;
                    }
                    i++;
                }
            }
        }
        return pase;
    }

    public static boolean validacion_vulgaridad(String user) {
        boolean groseria = false;
        return groseria;
    }
    
    public void personalizacion_ventana(){
        // Posición, título e icono de ventana
        this.setLocationRelativeTo(null);
        this.setTitle("Menú");
        ImageIcon img_2 = new ImageIcon("images/icon_perezoso_1.png");
        setIconImage(img_2.getImage());
        // Imagen central
        ImageIcon img = new ImageIcon("images/perezoso.png");
        JLabel icon = new JLabel();
        icon.setBounds(190, -60, 500, 500);
        icon.setIcon(new ImageIcon(img.getImage().getScaledInstance(280, 280, Image.SCALE_SMOOTH)));
        panel_menu.add(icon);           
        // Items
        ingrese_nombre.setBounds(265, 320, 160, 30);
        panel_menu.add(ingrese_nombre);
        usuario.setBounds(240, 350, 165, 30);
        panel_menu.add(usuario);
        to_datos_1.setBounds(285, 390, 80, 30);
        panel_menu.add(to_datos_1);
    }
}
