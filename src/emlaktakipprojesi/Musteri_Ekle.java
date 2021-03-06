/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emlaktakipprojesi;

import Database.Veritabani;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author speakingJoy
 */
public class Musteri_Ekle extends javax.swing.JFrame {

    private EmlakTakipProjesi gelen;
    Veritabani database;
    public Musteri_Ekle(EmlakTakipProjesi etp) {
        this.gelen=etp;
        database=new Veritabani();
        initComponents();
    }

    private Musteri_Ekle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtsoyad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtevtel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtemail = new javax.swing.JTextField();
        jbMusteriEkle = new javax.swing.JButton();
        jtceptel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADI");

        jtad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtadActionPerformed(evt);
            }
        });
        jtad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SOYADI");

        jtsoyad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtsoyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtsoyadKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EV TEL");

        jtevtel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtevtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtevtelActionPerformed(evt);
            }
        });
        jtevtel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtevtelKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CEP TEL");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-MAIL");

        jtemail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtemailActionPerformed(evt);
            }
        });
        jtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtemailKeyTyped(evt);
            }
        });

        jbMusteriEkle.setBackground(new java.awt.Color(255, 255, 255));
        jbMusteriEkle.setText("Kaydet");
        jbMusteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMusteriEkleActionPerformed(evt);
            }
        });

        jtceptel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtceptel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtceptelActionPerformed(evt);
            }
        });
        jtceptel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtceptelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbMusteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtevtel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtceptel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jtad, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtevtel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtceptel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jbMusteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtadActionPerformed

    private void jtadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtadKeyTyped
        char c = evt.getKeyChar();

        if(!(Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )) {

            JOptionPane.showMessageDialog(rootPane, "Lütfen Harf Giriniz!!!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtadKeyTyped

    private void jtsoyadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtsoyadKeyTyped
        char c = evt.getKeyChar();

        if(!(Character.isLetter(c) || c==KeyEvent.VK_BACK_SPACE ||c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )) {

            JOptionPane.showMessageDialog(rootPane, "Lütfen Harf Giriniz!!!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtsoyadKeyTyped

    private void jtevtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtevtelActionPerformed
            
    }//GEN-LAST:event_jtevtelActionPerformed

    private void jtevtelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtevtelKeyTyped
        char c = evt.getKeyChar();

        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )) {

            JOptionPane.showMessageDialog(rootPane, "Lütfen Rakam Giriniz!!!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtevtelKeyTyped

    private void jtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtemailActionPerformed

    private void jtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtemailKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtemailKeyTyped

    private void jbMusteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMusteriEkleActionPerformed
        // TODO add your handling code here:
        String ad=jtad.getText();
        String soyad=jtsoyad.getText();
        String evTel=jtevtel.getText();
        String cepTel=jtceptel.getText();
        String emailAdres=jtemail.getText();
        database.MusteriEkle(ad, soyad, cepTel, evTel, emailAdres);
        JOptionPane.showMessageDialog(rootPane, "Başarıyla Eklediniz");
        
        
    }//GEN-LAST:event_jbMusteriEkleActionPerformed

    private void jtceptelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtceptelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtceptelActionPerformed

    private void jtceptelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtceptelKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )) {

            JOptionPane.showMessageDialog(rootPane, "Lütfen Rakam Giriniz!!!");
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtceptelKeyTyped

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
            java.util.logging.Logger.getLogger(Musteri_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musteri_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musteri_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musteri_Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musteri_Ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMusteriEkle;
    private javax.swing.JTextField jtad;
    private javax.swing.JTextField jtceptel;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtevtel;
    private javax.swing.JTextField jtsoyad;
    // End of variables declaration//GEN-END:variables
}
