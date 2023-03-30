/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula_07.formulários;

/**
 *
 * @author Leandro
 */
public class atividade_1 extends javax.swing.JFrame {

   
    public atividade_1() {
        initComponents();
        Desabilitar();
        Habilitar();
        
    }
        
        void Desabilitar(){ 
    n1_txt.setEditable(false); 
    n2_txt.setEditable(false); 
    res_txt.setEditable(false); 
 
 } 
    void Habilitar(){ 
    n1_txt.setEditable(true); 
    n2_txt.setEditable(true); 
    res_txt.setEditable(true); 
 
 } 
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        n1_txt2 = new javax.swing.JTextField();
        n2_txt2 = new javax.swing.JTextField();
        res_txt2 = new javax.swing.JTextField();
        btn_soma2 = new javax.swing.JButton();
        btn_menos2 = new javax.swing.JButton();
        btn_multi2 = new javax.swing.JButton();
        btn_div2 = new javax.swing.JButton();
        btn_ret2 = new javax.swing.JButton();
        btn_new2 = new javax.swing.JButton();
        btn_erase2 = new javax.swing.JButton();
        btn_exit2 = new javax.swing.JButton();
        btn_comp2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Programacao de Comptadores"));
        jPanel3.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aula_07/formulários/pngegg.png"))); // NOI18N
        jLabel7.setText("N1");

        jLabel8.setText("N2");
        jLabel8.setToolTipText("");

        jLabel9.setText("Resultado");

        n1_txt2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n1_txt2.setToolTipText("");
        n1_txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1_txt2ActionPerformed(evt);
            }
        });

        btn_soma2.setText("+");
        btn_soma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soma2ActionPerformed(evt);
            }
        });

        btn_menos2.setText("-");
        btn_menos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menos2ActionPerformed(evt);
            }
        });

        btn_multi2.setText("*");
        btn_multi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multi2ActionPerformed(evt);
            }
        });

        btn_div2.setText("/");
        btn_div2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_div2ActionPerformed(evt);
            }
        });

        btn_ret2.setText("Retornar");
        btn_ret2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ret2ActionPerformed(evt);
            }
        });

        btn_new2.setText("Novo");
        btn_new2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new2ActionPerformed(evt);
            }
        });

        btn_erase2.setText("Limpar");
        btn_erase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_erase2ActionPerformed(evt);
            }
        });

        btn_exit2.setText("Sair");
        btn_exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit2ActionPerformed(evt);
            }
        });

        btn_comp2.setText("Comparacao");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n1_txt2)
                            .addComponent(n2_txt2)
                            .addComponent(res_txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_soma2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_menos2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_multi2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btn_div2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_ret2)
                                .addGap(30, 30, 30)
                                .addComponent(btn_new2)
                                .addGap(28, 28, 28)
                                .addComponent(btn_erase2)
                                .addGap(29, 29, 29)
                                .addComponent(btn_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_comp2)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(n1_txt2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_soma2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menos2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multi2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ret2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_erase2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_exit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_comp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 925, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n1_txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1_txt2ActionPerformed

    private void btn_soma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soma2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_soma2ActionPerformed

    private void btn_menos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_menos2ActionPerformed

    private void btn_multi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_multi2ActionPerformed

    private void btn_div2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_div2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_div2ActionPerformed

    private void btn_ret2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ret2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ret2ActionPerformed

    private void btn_new2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new2ActionPerformed

    private void btn_erase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_erase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_erase2ActionPerformed

    private void btn_exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exit2ActionPerformed

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
            java.util.logging.Logger.getLogger(atividade_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atividade_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atividade_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atividade_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comp2;
    private javax.swing.JButton btn_div2;
    private javax.swing.JButton btn_erase2;
    private javax.swing.JButton btn_exit2;
    private javax.swing.JButton btn_menos2;
    private javax.swing.JButton btn_multi2;
    private javax.swing.JButton btn_new2;
    private javax.swing.JButton btn_ret2;
    private javax.swing.JButton btn_soma2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField n1_txt2;
    private javax.swing.JTextField n2_txt2;
    private javax.swing.JTextField res_txt2;
    // End of variables declaration//GEN-END:variables
}
