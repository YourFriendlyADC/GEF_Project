
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.lang.String;

/**
 *
 * @author Victor1
 */
public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();

        // Personalización de Ventana
        // Posición
        this.setLocationRelativeTo(null);
        // Imagen de Oído
        ImageIcon img = new ImageIcon("images/ear.png");
        JLabel ear = new JLabel();
        ear.setBounds(170, -60, 500, 500);
        ear.setIcon(new ImageIcon(img.getImage().getScaledInstance(280, 280, Image.SCALE_SMOOTH)));
        panel_menu.add(ear);
        // Título
        this.setTitle("Menú");
        // Icono
        ImageIcon img_2 = new ImageIcon("images/bee.png");
        setIconImage(img_2.getImage());

//        Graphics g = new Graphics();
//        g.drawLine(320, 0, 320, 480);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu = new javax.swing.JPanel();
        to_datos_1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        archivos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_menu.setBackground(new java.awt.Color(215, 227, 252));
        panel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_menuMouseEntered(evt);
            }
        });

        to_datos_1.setBackground(new java.awt.Color(118, 158, 219));
        to_datos_1.setForeground(new java.awt.Color(255, 255, 255));
        to_datos_1.setText("Entrar");
        to_datos_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_datos_1ActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(118, 158, 219));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        usuario.setBackground(new java.awt.Color(241, 244, 251));
        usuario.setForeground(new java.awt.Color(0, 0, 102));
        usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 30, 16), 1, true));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Title TBC");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Inserte su nombre ");

        archivos.setBackground(new java.awt.Color(118, 158, 219));
        archivos.setForeground(new java.awt.Color(255, 255, 255));
        archivos.setText("Archivos");

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1))
                    .addGroup(panel_menuLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(to_datos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(archivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
            .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(to_datos_1)
                .addGap(50, 50, 50)
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
        if (validacion_nombre(user) == false) {
            System.out.println("no disponible");
            this.setVisible(true);
            d_1.setVisible(false);
        } else {
            this.setVisible(false);
            d_1.setVisible(true);
        }
        System.out.println(user);
    }//GEN-LAST:event_to_datos_1ActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        int n = 1;
        String users[][] = new String[5][100];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    users[i][j] = usuario.getText();
                }
            }
        }
    }//GEN-LAST:event_usuarioActionPerformed

    private void panel_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_menuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_menuMouseEntered

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JButton salir;
    public static javax.swing.JButton to_datos_1;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

//    class imagen extends JPanel {
//        private Image imagen;
//        @Override
//        public void paint(Graphics g) {
//            imagen = new ImageIcon(getClass.getGraphics("images/spidey.png")) {};
//            g.drawImage(imagen, 300, 400, 200, 400, this);
//        }
//    }
    public static boolean validacion_nombre(String user) {
        boolean pase = false;
        int i = 0;
        if ("".equals(user) || " ".equals(user)) {
            pase = false;
        } else {
            if (user.length() > 2) {
                while (pase == false || i >= user.length() - 1) {
                    System.out.println("ciclo " + i);
                    if (user == "  ") {
                        System.out.println("3 vacios"); // Arreglar
                    }
                    if (user.substring(i, i + 1) == " ") {
                        pase = false;
                    } else {
                        if (user.substring(i, i + 1) != " ") {
                            System.out.println(user.substring(i, i + 1));
                            System.out.println("longitud: " + user.length());
                            pase = true;
                        }
                    }
                }
            } // !" ".equals(user.substring(i, i + 1))
        }
        return pase;
    }

}
