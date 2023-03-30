
package aula_07.formulários;

/**
 *
 * @author Leandro
 */
public class atividade_2 extends javax.swing.JFrame {

 
    public atividade_2() {
        initComponents();
        Habilitar();
        Desabilitar();
        
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

        btn_soma = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_ret = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_erase = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_comp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n2_txt = new javax.swing.JTextField();
        res_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        n1_txt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_menos.setText("-");
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_multi.setText("*");
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });

        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_ret.setText("Retornar");
        btn_ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retActionPerformed(evt);
            }
        });

        btn_new.setText("Novo");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_erase.setText("Limpar");
        btn_erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eraseActionPerformed(evt);
            }
        });

        btn_exit.setText("Sair");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_comp.setText("Comparacao");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("N1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("N2");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Resultado");

        n1_txt.setColumns(20);
        n1_txt.setRows(5);
        jScrollPane1.setViewportView(n1_txt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ret)
                                .addGap(30, 30, 30)
                                .addComponent(btn_new)
                                .addGap(28, 28, 28)
                                .addComponent(btn_erase)
                                .addGap(29, 29, 29)
                                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_comp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(n2_txt)
                                .addComponent(res_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ret, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_erase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_comp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed

        // TODO add your handling code here:
        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor
        x = Integer.parseInt( n1_txt.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt( n2_txt.getText());

        z= x + y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja
        res_txt.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor
        x = Integer.parseInt( n1_txt.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt( n2_txt.getText());

        z= x - y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja
        res_txt.setText(r);// Camppo de resposta recebendo valor         // TODO add your handling code here:
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor
        x = Integer.parseInt( n1_txt.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt( n2_txt.getText());

        z= x * y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja
        res_txt.setText(r);// Camppo de resposta recebendo valor       // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor
        x = Integer.parseInt( n1_txt.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt( n2_txt.getText());

        z= x / y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja
        res_txt.setText(r);// Camppo de resposta recebendo valor        // TODO add your handling code here:
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retActionPerformed

        retorno x = new retorno();

        x.setVisible(true);
        dispose();             // TODO add your handling code here:
    }//GEN-LAST:event_btn_retActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        Habilitar();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_eraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eraseActionPerformed
        n1_txt.setText("");
        n2_txt.setText("");
        res_txt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eraseActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(atividade_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atividade_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atividade_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atividade_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comp;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_erase;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_ret;
    private javax.swing.JButton btn_soma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea n1_txt;
    private javax.swing.JTextField n2_txt;
    private javax.swing.JTextField res_txt;
    // End of variables declaration//GEN-END:variables
}
