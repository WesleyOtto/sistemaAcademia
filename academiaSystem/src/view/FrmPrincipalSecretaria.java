/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author wesle
 */
public class FrmPrincipalSecretaria extends javax.swing.JFrame {

    private String args[] = {""};

    /**
     * Creates new form FrmPrincipalAdm
     */
    public FrmPrincipalSecretaria() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastroAluno = new javax.swing.JMenu();
        jAlunoItemCadastrar = new javax.swing.JMenuItem();
        jAlunoItemAlterar = new javax.swing.JMenuItem();
        jAluniItemBuscar = new javax.swing.JMenuItem();
        jConfigBD = new javax.swing.JMenu();
        jConfiguraçãoItemBancodeDados = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSobreItemAbout = new javax.swing.JMenuItem();
        Jsair = new javax.swing.JMenu();
        jSairItemLogout = new javax.swing.JMenuItem();
        jSairItemSairSistema = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Secretaria.jpg"))); // NOI18N

        jCadastroAluno.setText("Aluno");
        jCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroAlunoActionPerformed(evt);
            }
        });

        jAlunoItemCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jAlunoItemCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arquivo.jpg"))); // NOI18N
        jAlunoItemCadastrar.setText("Cadastrar");
        jAlunoItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlunoItemCadastrarActionPerformed(evt);
            }
        });
        jCadastroAluno.add(jAlunoItemCadastrar);

        jAlunoItemAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jAlunoItemAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Alterar.jpg"))); // NOI18N
        jAlunoItemAlterar.setText("Alterar");
        jAlunoItemAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlunoItemAlterarActionPerformed(evt);
            }
        });
        jCadastroAluno.add(jAlunoItemAlterar);

        jAluniItemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jAluniItemBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.jpg"))); // NOI18N
        jAluniItemBuscar.setText("Buscar");
        jAluniItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAluniItemBuscarActionPerformed(evt);
            }
        });
        jCadastroAluno.add(jAluniItemBuscar);

        jMenuBar1.add(jCadastroAluno);

        jConfigBD.setText("Configuração");

        jConfiguraçãoItemBancodeDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.ALT_MASK));
        jConfiguraçãoItemBancodeDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BDimagens1.jpg"))); // NOI18N
        jConfiguraçãoItemBancodeDados.setText("Banco de dados");
        jConfiguraçãoItemBancodeDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfiguraçãoItemBancodeDadosActionPerformed(evt);
            }
        });
        jConfigBD.add(jConfiguraçãoItemBancodeDados);

        jMenuBar1.add(jConfigBD);

        jMenu5.setText("Sobre");
        jMenu5.add(jSeparator1);

        jSobreItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.ALT_MASK));
        jSobreItemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimages.jpg"))); // NOI18N
        jSobreItemAbout.setText("About");
        jSobreItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSobreItemAboutActionPerformed(evt);
            }
        });
        jMenu5.add(jSobreItemAbout);

        jMenuBar1.add(jMenu5);

        Jsair.setText("Sair");

        jSairItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jSairItemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout.jpg"))); // NOI18N
        jSairItemLogout.setText("Logout");
        jSairItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairItemLogoutActionPerformed(evt);
            }
        });
        Jsair.add(jSairItemLogout);

        jSairItemSairSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jSairItemSairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Desligar.jpg"))); // NOI18N
        jSairItemSairSistema.setText("Desligar");
        jSairItemSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairItemSairSistemaActionPerformed(evt);
            }
        });
        Jsair.add(jSairItemSairSistema);

        jMenuBar1.add(Jsair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAlunoItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlunoItemCadastrarActionPerformed
        // TODO add your handling code here:
        FrmAlunoCadastrar.main(args);
    }//GEN-LAST:event_jAlunoItemCadastrarActionPerformed

    private void jSobreItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSobreItemAboutActionPerformed
        // TODO add your handling code here:
        FrmSobre.main(args);
    }//GEN-LAST:event_jSobreItemAboutActionPerformed

    private void jAlunoItemAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlunoItemAlterarActionPerformed
        // TODO add your handling code here:
        FrmAlunoAlterar.main(args);
    }//GEN-LAST:event_jAlunoItemAlterarActionPerformed

    private void jConfiguraçãoItemBancodeDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfiguraçãoItemBancodeDadosActionPerformed
        // TODO add your handling code here:
        FrmConnect.main(args);
    }//GEN-LAST:event_jConfiguraçãoItemBancodeDadosActionPerformed

    private void jSairItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairItemLogoutActionPerformed
        // TODO add your handling code here:
        FrmTelaLogin.main(args);
        this.dispose();
    }//GEN-LAST:event_jSairItemLogoutActionPerformed

    private void jSairItemSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairItemSairSistemaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jSairItemSairSistemaActionPerformed

    private void jCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroAlunoActionPerformed

    private void jAluniItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAluniItemBuscarActionPerformed
        // TODO add your handling code here:
        FrmAlunoBuscar.main(args);
    }//GEN-LAST:event_jAluniItemBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jsair;
    private javax.swing.JMenuItem jAluniItemBuscar;
    private javax.swing.JMenuItem jAlunoItemAlterar;
    private javax.swing.JMenuItem jAlunoItemCadastrar;
    private javax.swing.JMenu jCadastroAluno;
    private javax.swing.JMenu jConfigBD;
    private javax.swing.JMenuItem jConfiguraçãoItemBancodeDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jSairItemLogout;
    private javax.swing.JMenuItem jSairItemSairSistema;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jSobreItemAbout;
    // End of variables declaration//GEN-END:variables
}