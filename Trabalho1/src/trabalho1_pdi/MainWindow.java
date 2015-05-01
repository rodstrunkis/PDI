package trabalho1_pdi;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }
    
     public static BufferedImage YUV (){
        try {
            //Cria o buffer da imagem
            BufferedImage image = ImageIO.read(new File("Imagens/beach_huts.jpg"));
            //Variáveis para altura e largura da imagem
            int w = image.getWidth();
            int h = image.getHeight();
            //For aninhado que percorre todos os pixels da imagem
            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {
                    
                    int rgb = image.getRGB(lin, col);
                    int alpha = (rgb>>24)&0xff;
                    int red = (rgb>>16)&0xff;
                    int green = (rgb>>8)&0xff;
                    int blue = (rgb>>0)&0xff;
                    
                    rgb = (alpha<<24) | (red<<16) | (green<<8) | blue;
                    image.setRGB(lin, col, rgb);
                }
            }
            ImageIO.write(image, "JPG", new File("Imagens/beach_huts_negativo.jpg"));
            return image;
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static BufferedImage Red (){
        try {
            //Cria o buffer da imagem
            BufferedImage image = ImageIO.read(new File("Imagens/beach_huts.jpg"));
            //Variáveis para altura e largura da imagem
            int w = image.getWidth();
            int h = image.getHeight();
            //For aninhado que percorre todos os pixels da imagem
            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {
                    
                    int rgb = image.getRGB(lin, col);
                    int alpha = (rgb>>24)&0xff;
                    int red = (rgb>>16)&0xff;
                    
                    rgb = (alpha<<24) | (red<<16) | (0<<8) | 0;
                    image.setRGB(lin, col, rgb);
                }
            }
            ImageIO.write(image, "JPG", new File("Imagens/beach_huts_red.jpg"));
            return image;
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static BufferedImage Green (){
        try {
            //Cria o buffer da imagem
            BufferedImage image = ImageIO.read(new File("Imagens/beach_huts.jpg"));
            //Variáveis para altura e largura da imagem
            int w = image.getWidth();
            int h = image.getHeight();
            //For aninhado que percorre todos os pixels da imagem
            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {
                    
                    int rgb = image.getRGB(lin, col);
                    int alpha = (rgb>>24)&0xff;
                    int green = (rgb>>8)&0xff;
                    
                    rgb = (alpha<<24) | (0<<16) | (green<<8) | 0;
                    image.setRGB(lin, col, rgb);
                }
            }
            ImageIO.write(image, "JPG", new File("Imagens/beach_huts_green.jpg"));
            return image;
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
   
    public static BufferedImage Blue (){
        try {
            //Cria o buffer da imagem
            BufferedImage image = ImageIO.read(new File("Imagens/beach_huts.jpg"));
            //Variáveis para altura e largura da imagem
            int w = image.getWidth();
            int h = image.getHeight();
            //For aninhado que percorre todos os pixels da imagem
            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {
                    
                    int rgb = image.getRGB(lin, col);
                    int alpha = (rgb>>24)&0xff;
                    int blue = (rgb>>0)&0xff;
                    
                    rgb = (alpha<<24) | (0<<16) | (0<<8) | blue;
                    image.setRGB(lin, col, rgb);
                }
            }
            ImageIO.write(image, "JPG", new File("Imagens/beach_huts_blue.jpg"));
            return image;
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static BufferedImage Negativo (){
        try {
            //Cria o buffer da imagem
            BufferedImage image = ImageIO.read(new File("Imagens/beach_huts.jpg"));
            //Variáveis para altura e largura da imagem
            int w = image.getWidth();
            int h = image.getHeight();
            //For aninhado que percorre todos os pixels da imagem
            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {
                    
                    int rgb = image.getRGB(lin, col);
                    int alpha = (rgb>>24)&0xff;
                    int red = (rgb>>16)&0xff;
                    int green = (rgb>>8)&0xff;
                    int blue = (rgb>>0)&0xff;
                    
                    red = 255 - red;
                    green = 255 - green;
                    blue = 255 - blue;
                    
                    rgb = (alpha<<24) | (red<<16) | (green<<8) | blue;
                    image.setRGB(lin, col, rgb);
                }
            }
            ImageIO.write(image, "JPG", new File("Imagens/beach_huts_negativo.jpg"));
            return image;
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jButtonRed = new javax.swing.JButton();
        jButtonGreen = new javax.swing.JButton();
        jButtonBlue = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelC = new javax.swing.JLabel();
        jButtonNegativo = new javax.swing.JButton();
        jButtonRGBYUV = new javax.swing.JButton();
        jButtonYUVRGB = new javax.swing.JButton();
        jLabelD = new javax.swing.JLabel();
        jLabelE = new javax.swing.JLabel();
        jLabelF = new javax.swing.JLabel();
        jLabelG = new javax.swing.JLabel();
        jLabelH = new javax.swing.JLabel();
        jButtonAditivo = new javax.swing.JButton();
        jButtonMultiplicativo = new javax.swing.JButton();
        jButtonMediana = new javax.swing.JButton();
        jButtonDesvio = new javax.swing.JButton();
        jButtonDimensao = new javax.swing.JButton();
        jLabelPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho1_PDI");

        jButton1.setText("Default");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelA.setText("Letra A");

        jLabelB.setText("Letra B");

        jButtonRed.setText("R");
        jButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedActionPerformed(evt);
            }
        });

        jButtonGreen.setText("G");
        jButtonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGreenActionPerformed(evt);
            }
        });

        jButtonBlue.setText("B");
        jButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlueActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabelC.setText("Letra C");

        jButtonNegativo.setText("Negativo");
        jButtonNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegativoActionPerformed(evt);
            }
        });

        jButtonRGBYUV.setText("RGB>YUV");
        jButtonRGBYUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRGBYUVActionPerformed(evt);
            }
        });

        jButtonYUVRGB.setText("YUV>RGB");
        jButtonYUVRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYUVRGBActionPerformed(evt);
            }
        });

        jLabelD.setText("Letra D");

        jLabelE.setText("Letra E");

        jLabelF.setText("Letra F");

        jLabelG.setText("Letra G");

        jLabelH.setText("Letra H");

        jButtonAditivo.setText("Aditivo");
        jButtonAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAditivoActionPerformed(evt);
            }
        });

        jButtonMultiplicativo.setText("Multip");
        jButtonMultiplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicativoActionPerformed(evt);
            }
        });

        jButtonMediana.setText("Media(na)");
        jButtonMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedianaActionPerformed(evt);
            }
        });

        jButtonDesvio.setText("Desvio");
        jButtonDesvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesvioActionPerformed(evt);
            }
        });

        jButtonDimensao.setText("Dimensão");
        jButtonDimensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDimensaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDesvio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMediana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jButtonMultiplicativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAditivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNegativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonYUVRGB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRGBYUV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDimensao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRGBYUV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonYUVRGB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBlue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNegativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAditivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMultiplicativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelG)
                .addGap(3, 3, 3)
                .addComponent(jButtonDesvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDimensao)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonFechar)
                .addContainerGap())
        );

        jLabelPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodolfo\\Documents\\NetBeansProjects\\Trabalho1_PDI\\Imagens\\beach_huts.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedActionPerformed
        Red();
        jLabelPrincipal.setIcon(new ImageIcon("C:Imagens/beach_huts_red.jpg"));
    }//GEN-LAST:event_jButtonRedActionPerformed

    private void jButtonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGreenActionPerformed
        Green();
        jLabelPrincipal.setIcon(new ImageIcon("Imagens/beach_huts_green.jpg"));
    }//GEN-LAST:event_jButtonGreenActionPerformed

    private void jButtonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlueActionPerformed
        Blue();
        jLabelPrincipal.setIcon(new ImageIcon("Imagens/beach_huts_blue.jpg"));
    }//GEN-LAST:event_jButtonBlueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelPrincipal.setIcon(new ImageIcon("Imagens/beach_huts.jpg"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegativoActionPerformed
        Negativo();
        jLabelPrincipal.setIcon(new ImageIcon("Imagens/beach_huts_negativo.jpg"));
    }//GEN-LAST:event_jButtonNegativoActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonRGBYUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRGBYUVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRGBYUVActionPerformed

    private void jButtonYUVRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYUVRGBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonYUVRGBActionPerformed

    private void jButtonAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAditivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAditivoActionPerformed

    private void jButtonMultiplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMultiplicativoActionPerformed

    private void jButtonMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedianaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMedianaActionPerformed

    private void jButtonDesvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDesvioActionPerformed

    private void jButtonDimensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDimensaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDimensaoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAditivo;
    private javax.swing.JButton jButtonBlue;
    private javax.swing.JButton jButtonDesvio;
    private javax.swing.JButton jButtonDimensao;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonGreen;
    private javax.swing.JButton jButtonMediana;
    private javax.swing.JButton jButtonMultiplicativo;
    private javax.swing.JButton jButtonNegativo;
    private javax.swing.JButton jButtonRGBYUV;
    private javax.swing.JButton jButtonRed;
    private javax.swing.JButton jButtonYUVRGB;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelE;
    private javax.swing.JLabel jLabelF;
    private javax.swing.JLabel jLabelG;
    private javax.swing.JLabel jLabelH;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JPanel jPanelBotoes;
    // End of variables declaration//GEN-END:variables
}
