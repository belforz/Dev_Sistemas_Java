/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula_07.formulários;

/**
 *
 * @author maced
 */
public class denovo extends javax.swing.JFrame {

   private separacao separacaoObj;
   
    public denovo() {
        initComponents();
       separacaoObj = new separacao();
       separacaoObj.txt_n1 = txt_n1;
    separacaoObj.txt_n2 = txt_n2;
    separacaoObj.txt_res = txt_res;
        
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_n1 = new javax.swing.JTextField();
        txt_n2 = new javax.swing.JTextField();
        txt_res = new javax.swing.JTextField();
        btn_soma = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_retorno = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_comparar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROGRAMACAO WEB", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel1.setText("n1");

        jLabel2.setText("n2");

        jLabel3.setText("res");

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
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

        btn_retorno.setText("Retornar");
        btn_retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retornoActionPerformed(evt);
            }
        });

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_comparar.setText("Comparar");
        btn_comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_soma)
                    .addComponent(btn_div))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_multi)
                    .addComponent(btn_sub))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_n1)
                    .addComponent(txt_n2)
                    .addComponent(txt_res, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_retorno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(btn_novo)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sair)
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_comparar)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_soma)
                            .addComponent(btn_sub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_multi)
                            .addComponent(btn_div))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_retorno)
                            .addComponent(btn_novo))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpar)
                            .addComponent(btn_sair))
                        .addGap(34, 34, 34)
                        .addComponent(btn_comparar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed
    int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x + y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor         // TODO add your handling code here:
    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
    int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x - y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor         // TODO add your handling code here:
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
     int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x / y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor         // TODO add your handling code here:
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
    int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x * y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor         // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        txt_n1.setText("");
         txt_n2.setText("");
         txt_res.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
         separacaoObj.Habilitar();   // TODO add your handling code here:
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_retornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retornoActionPerformed
        retorno_formulario x = new retorno_formulario();

        x.setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_btn_retornoActionPerformed

    private void btn_compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compararActionPerformed
        int text1 = Integer.parseInt(txt_n1.getText());
        int text2 = Integer.parseInt(txt_n2.getText());
        
         if (text1 > text2) {
        txt_res.setText("Este número é maior: " + text1);
    } else {
        txt_res.setText(Integer.toString(text2));
    }
       
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_compararActionPerformed

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
            java.util.logging.Logger.getLogger(denovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(denovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(denovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(denovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new denovo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comparar;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_retorno;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_soma;
    private javax.swing.JButton btn_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
