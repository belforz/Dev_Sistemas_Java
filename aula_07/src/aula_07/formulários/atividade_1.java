/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula_07.formulários;

/**
 *
 * @author maced
 */
public class atividade_1 extends javax.swing.JFrame {

    /**
     * Creates new form atividade_1
     */
    public atividade_1() {
      initComponents();
        Habilitar();
        Desabilitar();
        
    }
 void Desabilitar(){
 txt_n1.setEditable(false);
 txt_n2.setEditable(false);
 txt_res.setEditable(false);

 }
void Habilitar(){
 txt_n1.setEditable(true);
 txt_n2.setEditable(true);
 txt_res.setEditable(true);

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
        btn_meno = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_comparar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_retorno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programa WEB", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 18), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel1.setText("N1");

        jLabel2.setText("N2");

        jLabel3.setText("Resultado");

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_meno.setText("-");
        btn_meno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menoActionPerformed(evt);
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

        btn_comparar.setText("Comparacao");
        btn_comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compararActionPerformed(evt);
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

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_retorno.setText("Retornar");
        btn_retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_n1)
                            .addComponent(txt_n2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txt_res)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_limpar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btn_soma)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_meno)
                            .addComponent(btn_sair))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_novo)
                            .addComponent(btn_multi))))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_div)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btn_comparar)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_retorno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_n1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_soma)
                    .addComponent(btn_meno)
                    .addComponent(btn_multi)
                    .addComponent(btn_div)
                    .addComponent(btn_comparar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar)
                    .addComponent(btn_sair)
                    .addComponent(btn_novo)
                    .addComponent(btn_retorno))
                .addContainerGap())
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

 txt_res.setText(r);// Camppo de resposta recebendo valor 
    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_menoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menoActionPerformed
      int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x - y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor 
    }//GEN-LAST:event_btn_menoActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x * y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor 
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
     int x, y, z; // Variáveis de apoio
    String r; // R string para receber valor


    x = Integer.parseInt( txt_n1.getText()); //Mesclando o Campo com a variável
    y = Integer.parseInt( txt_n2.getText());

 z= x / y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor 
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compararActionPerformed
     int x, y, z;
     
     String r;
     
     x = Integer.parseInt(txt_n1.getText());
     y = Integer.parseInt(txt_n2.getText());
     
     if( x > y){
         System.out.println("Este número é maior" + x);
         
     }
     else {
         System.out.println("Este numero é menor" + y );
     }
     
    }//GEN-LAST:event_btn_compararActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
         txt_n1.setText("");
         txt_n2.setText("");
         txt_res.setText(""); 
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
      Habilitar();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_retornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retornoActionPerformed
      retorno_formulario x = new retorno_formulario();

        x.setVisible(true);
        dispose();   
    }//GEN-LAST:event_btn_retornoActionPerformed

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
    private javax.swing.JButton btn_comparar;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_meno;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_retorno;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_soma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
