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
public class FrmPrincipalInstrutor extends javax.swing.JFrame {

    private String args[] = {""};

    /**
     * Creates new form FrmPrincipalAdm
     */
    public FrmPrincipalInstrutor() {

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
        jAluniItemBuscar = new javax.swing.JMenuItem();
        jTreinos = new javax.swing.JMenu();
        jTreinosItemCadastrar = new javax.swing.JMenuItem();
        jTreinosItemBuscar = new javax.swing.JMenuItem();
        jExercicios = new javax.swing.JMenu();
        jExercicioItemCadastrar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jAvaliacaoFisicaItemCadastrar = new javax.swing.JMenuItem();
        jAvaliacaoFisicaItemBuscar = new javax.swing.JMenuItem();
        jAvaliacaoFisicaItemRelatorio = new javax.swing.JMenuItem();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Instrutor.jpg"))); // NOI18N

        jCadastroAluno.setText("Aluno");
        jCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroAlunoActionPerformed(evt);
            }
        });

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

        jTreinos.setText("Treinos");

        jTreinosItemCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.ALT_MASK));
        jTreinosItemCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arquivo.jpg"))); // NOI18N
        jTreinosItemCadastrar.setText("Cadastrar");
        jTreinosItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTreinosItemCadastrarActionPerformed(evt);
            }
        });
        jTreinos.add(jTreinosItemCadastrar);

        jTreinosItemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SLASH, java.awt.event.InputEvent.ALT_MASK));
        jTreinosItemBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.jpg"))); // NOI18N
        jTreinosItemBuscar.setText("Buscar");
        jTreinosItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTreinosItemBuscarActionPerformed(evt);
            }
        });
        jTreinos.add(jTreinosItemBuscar);

        jMenuBar1.add(jTreinos);

        jExercicios.setText("Exercicios");

        jExercicioItemCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jExercicioItemCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arquivo.jpg"))); // NOI18N
        jExercicioItemCadastrar.setText("Cadastrar");
        jExercicioItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExercicioItemCadastrarActionPerformed(evt);
            }
        });
        jExercicios.add(jExercicioItemCadastrar);

        jMenuBar1.add(jExercicios);

        jMenu4.setText("Avaliação Fisica");

        jAvaliacaoFisicaItemCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        jAvaliacaoFisicaItemCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arquivo.jpg"))); // NOI18N
        jAvaliacaoFisicaItemCadastrar.setText("Cadastrar");
        jAvaliacaoFisicaItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvaliacaoFisicaItemCadastrarActionPerformed(evt);
            }
        });
        jMenu4.add(jAvaliacaoFisicaItemCadastrar);

        jAvaliacaoFisicaItemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        jAvaliacaoFisicaItemBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.jpg"))); // NOI18N
        jAvaliacaoFisicaItemBuscar.setText("Buscar");
        jAvaliacaoFisicaItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvaliacaoFisicaItemBuscarActionPerformed(evt);
            }
        });
        jMenu4.add(jAvaliacaoFisicaItemBuscar);

        jAvaliacaoFisicaItemRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infoimages.jpg"))); // NOI18N
        jAvaliacaoFisicaItemRelatorio.setText("Relatório");
        jAvaliacaoFisicaItemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvaliacaoFisicaItemRelatorioActionPerformed(evt);
            }
        });
        jMenu4.add(jAvaliacaoFisicaItemRelatorio);

        jMenuBar1.add(jMenu4);

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
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTreinosItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTreinosItemBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTreinosItemBuscarActionPerformed

    private void jAvaliacaoFisicaItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvaliacaoFisicaItemBuscarActionPerformed
        // TODO add your handling code here:
        FrmAvaliacaoFisicaBuscar.main(args);
    }//GEN-LAST:event_jAvaliacaoFisicaItemBuscarActionPerformed

    private void jSobreItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSobreItemAboutActionPerformed
        // TODO add your handling code here:
        FrmSobre.main(args);
    }//GEN-LAST:event_jSobreItemAboutActionPerformed

    private void jSairItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairItemLogoutActionPerformed
        // TODO add your handling code here:
        FrmTelaLogin.main(args);
        this.dispose();
    }//GEN-LAST:event_jSairItemLogoutActionPerformed

    private void jSairItemSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairItemSairSistemaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jSairItemSairSistemaActionPerformed

    private void jAvaliacaoFisicaItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvaliacaoFisicaItemCadastrarActionPerformed
        // TODO add your handling code here:
        FrmAvaliacaoFisica.main(args);
    }//GEN-LAST:event_jAvaliacaoFisicaItemCadastrarActionPerformed

    private void jAvaliacaoFisicaItemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvaliacaoFisicaItemRelatorioActionPerformed
        // TODO add your handling code here:
        FrmAvaliacaoFisicaRelatorio.main(args);
    }//GEN-LAST:event_jAvaliacaoFisicaItemRelatorioActionPerformed

    private void jTreinosItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTreinosItemCadastrarActionPerformed
        // TODO add your handling code here:
        FrmTreinoCadastrar.main(args);
    }//GEN-LAST:event_jTreinosItemCadastrarActionPerformed

    private void jExercicioItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExercicioItemCadastrarActionPerformed
        // TODO add your handling code here:
        FrmExercicioCadastrar.main(args);
    }//GEN-LAST:event_jExercicioItemCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmPrincipalInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jsair;
    private javax.swing.JMenuItem jAluniItemBuscar;
    private javax.swing.JMenuItem jAvaliacaoFisicaItemBuscar;
    private javax.swing.JMenuItem jAvaliacaoFisicaItemCadastrar;
    private javax.swing.JMenuItem jAvaliacaoFisicaItemRelatorio;
    private javax.swing.JMenu jCadastroAluno;
    private javax.swing.JMenuItem jExercicioItemCadastrar;
    private javax.swing.JMenu jExercicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
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
    private javax.swing.JMenu jTreinos;
    private javax.swing.JMenuItem jTreinosItemBuscar;
    private javax.swing.JMenuItem jTreinosItemCadastrar;
    // End of variables declaration//GEN-END:variables
}