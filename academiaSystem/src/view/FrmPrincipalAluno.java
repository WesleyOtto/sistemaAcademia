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
public class FrmPrincipalAluno extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipalAluno
     */
    public FrmPrincipalAluno() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFatura = new javax.swing.JMenu();
        jFaturaItemEmitirFatura = new javax.swing.JMenuItem();
        jTreinoItemBuscarTreino = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jAvaliacaoFisica = new javax.swing.JMenu();
        jAvaFisiBuscar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuFatura.setText("Fatura");

        jFaturaItemEmitirFatura.setText("Emitir Fatura");
        jFaturaItemEmitirFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFaturaItemEmitirFaturaActionPerformed(evt);
            }
        });
        jMenuFatura.add(jFaturaItemEmitirFatura);

        jMenuBar1.add(jMenuFatura);

        jTreinoItemBuscarTreino.setText("Treinos");

        jMenuItem2.setText("Buscar Treino");
        jTreinoItemBuscarTreino.add(jMenuItem2);

        jMenuBar1.add(jTreinoItemBuscarTreino);

        jAvaliacaoFisica.setText("AvaliacaoFisica");

        jAvaFisiBuscar.setText("Buscar avaliação");
        jAvaFisiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvaFisiBuscarActionPerformed(evt);
            }
        });
        jAvaliacaoFisica.add(jAvaFisiBuscar);

        jMenuBar1.add(jAvaliacaoFisica);

        jMenu5.setText("Sair");
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFaturaItemEmitirFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFaturaItemEmitirFaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFaturaItemEmitirFaturaActionPerformed

    private void jAvaFisiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvaFisiBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAvaFisiBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmPrincipalAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAvaFisiBuscar;
    private javax.swing.JMenu jAvaliacaoFisica;
    private javax.swing.JMenuItem jFaturaItemEmitirFatura;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFatura;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jTreinoItemBuscarTreino;
    // End of variables declaration//GEN-END:variables
}
