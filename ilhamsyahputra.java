/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilhamsyahputra;

/**
 *
 * @author User
 */
public class ilhamsyahputra extends javax.swing.JFrame {
    String angka;
    double jumlah, bil1, bil2;
    int pilih;
    /**
     * Creates new form ilhamsyahputra
     */
    public ilhamsyahputra() {
        initComponents();
         angka = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tampil = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        btnhasil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tampil.setEditable(false);
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        hapus.setText("c");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        angka7.setText("7");
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        angka8.setText("8");
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        btnkali.setText("x");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        angka9.setText("9");
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        angka4.setText("4");
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka5.setText("5");
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka6.setText("6");
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        angka1.setText("1");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        angka2.setText("2");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        angka3.setText("3");
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        jButton15.setText(".");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        angka0.setText("0");
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        btnhasil.setText("=");
        btnhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhasilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tampil)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(angka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
bil1 = Double.parseDouble(angka);
tampil.setText("/");
angka = "";
pilih=4;
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
bil1 = Double.parseDouble(angka);
tampil.setText("*");
angka = "";
pilih=3;
    }//GEN-LAST:event_btnkaliActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
angka += "1";
tampil.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
        angka += "0";
 tampil.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void btnhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhasilActionPerformed
switch (pilih){
        case 1:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1+bil2;
            angka = Double.toString(jumlah);
            tampil.setText(angka);
            break;
        case 2:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1-bil2;
            angka = Double.toString(jumlah);
            tampil.setText(angka);
            break;
        case 3:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1*bil2;
            angka = Double.toString(jumlah);
            tampil.setText(angka);
            break;
        case 4:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1/bil2;
            angka = Double.toString(jumlah);
            tampil.setText(angka);
            break;
        default:
            break;     
            
    }//GEN-LAST:event_btnhasilActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
angka += "2";
tampil.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
angka += "3";
tampil.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
angka += "6";
tampil.setText(angka);
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
angka += "7";
tampil.setText(angka);
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
angka += "8";
tampil.setText(angka);
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
angka += "9";
tampil.setText(angka);
    }//GEN-LAST:event_angka9ActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
bil1 = Double.parseDouble(angka);
tampil.setText("-");
angka = "";
pilih=2;
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
bil1 = Double.parseDouble(angka);
tampil.setText("+");
angka = "";
pilih=1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
angka += "4";
tampil.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
angka += "5";
tampil.setText(angka);
    }//GEN-LAST:event_angka5ActionPerformed

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
            java.util.logging.Logger.getLogger(ilhamsyahputra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilhamsyahputra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilhamsyahputra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilhamsyahputra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ilhamsyahputra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnhasil;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton15;
    private javax.swing.JTextField tampil;
    // End of variables declaration//GEN-END:variables
}
