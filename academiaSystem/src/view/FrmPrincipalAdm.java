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
public class FrmPrincipalAdm extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipalAdm
     */
    public FrmPrincipalAdm() {
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastroAluno = new javax.swing.JMenu();
        jAlunoItemCadastrar = new javax.swing.JMenuItem();
        jAlunoItemAlterarAluno = new javax.swing.JMenuItem();
        jAlunoItemDeletarAluno = new javax.swing.JMenuItem();
        jFuncionario = new javax.swing.JMenu();
        jFuncionarioItemCadastrar = new javax.swing.JMenuItem();
        jFuncionarioItemAlterar = new javax.swing.JMenuItem();
        jFuncionarioItemDeletar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jTreinos = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jGerenciarNivelAcesso = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jConfigBD = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Jsair = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tela ADM");

        jCadastroAluno.setText("Aluno");

        jAlunoItemCadastrar.setText("Cadastrar Aluno");
        jAlunoItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlunoItemCadastrarActionPerformed(evt);
            }
        });
        jCadastroAluno.add(jAlunoItemCadastrar);

        jAlunoItemAlterarAluno.setText("Alterar Aluno");
        jCadastroAluno.add(jAlunoItemAlterarAluno);

        jAlunoItemDeletarAluno.setText("Deletar Aluno");
        jAlunoItemDeletarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlunoItemDeletarAlunoActionPerformed(evt);
            }
        });
        jCadastroAluno.add(jAlunoItemDeletarAluno);

        jMenuBar1.add(jCadastroAluno);

        jFuncionario.setText("Funcionário");

        jFuncionarioItemCadastrar.setText("Cadastrar");
        jFuncionarioItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFuncionarioItemCadastrarActionPerformed(evt);
            }
        });
        jFuncionario.add(jFuncionarioItemCadastrar);

        jFuncionarioItemAlterar.setText("Alterar");
        jFuncionario.add(jFuncionarioItemAlterar);

        jFuncionarioItemDeletar.setText("Deletar");
        jFuncionario.add(jFuncionarioItemDeletar);
        jFuncionario.add(jSeparator2);

        jMenuBar1.add(jFuncionario);

        jMenu1.setText("Fatura");
        jMenuBar1.add(jMenu1);

        jTreinos.setText("Treinos");
        jMenuBar1.add(jTreinos);

        jMenu3.setText("Exercicios");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Avaliação Fisica");
        jMenuBar1.add(jMenu4);

        jGerenciarNivelAcesso.setText("Gerenciar Usuários");

        jMenuItem3.setText("NivelAcesso");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jGerenciarNivelAcesso.add(jMenuItem3);

        jMenuBar1.add(jGerenciarNivelAcesso);

        jConfigBD.setText("Configuração");

        jMenuItem1.setText("Banco de dados");
        jConfigBD.add(jMenuItem1);

        jMenuBar1.add(jConfigBD);

        jMenu5.setText("Sobre");
        jMenu5.add(jSeparator1);

        jMenuBar1.add(jMenu5);

        Jsair.setText("Sair");
        jMenuBar1.add(Jsair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(666, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAlunoItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlunoItemCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlunoItemCadastrarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jAlunoItemDeletarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlunoItemDeletarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlunoItemDeletarAlunoActionPerformed

    private void jFuncionarioItemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFuncionarioItemCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFuncionarioItemCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jsair;
    private javax.swing.JMenuItem jAlunoItemAlterarAluno;
    private javax.swing.JMenuItem jAlunoItemCadastrar;
    private javax.swing.JMenuItem jAlunoItemDeletarAluno;
    private javax.swing.JMenu jCadastroAluno;
    private javax.swing.JMenu jConfigBD;
    private javax.swing.JMenu jFuncionario;
    private javax.swing.JMenuItem jFuncionarioItemAlterar;
    private javax.swing.JMenuItem jFuncionarioItemCadastrar;
    private javax.swing.JMenuItem jFuncionarioItemDeletar;
    private javax.swing.JMenu jGerenciarNivelAcesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jTreinos;
    // End of variables declaration//GEN-END:variables
}
