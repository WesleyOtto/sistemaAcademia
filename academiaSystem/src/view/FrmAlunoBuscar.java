/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import DAO.AlunoDAO;
import DAO.EnderecoDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;
import Controller.FrmAlunoBuscarController;

/**
 *
 * @author wesle
 */
public class FrmAlunoBuscar extends javax.swing.JFrame {

    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();
    FrmAlunoBuscarController buscar = new FrmAlunoBuscarController();

    /**
     * Creates new form FrmAlunoBuscar
     */
    public FrmAlunoBuscar() {
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

        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEndereco = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Aluno");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Buscar Aluno:");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "matriculaAluno", "nome", "CPF", "RG", "telefone", "celular", "email", "nivelAcesso", "Acesso_usuario", "dataMatricula", "profissao", "status"
            }
        ));
        jScrollPane1.setViewportView(jTableAluno);

        jTabbedPane1.addTab("Dados Aluno", jScrollPane1);

        jTableEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idUsuario", "MatriculaAluno", "rua", "Numero", "bairro", "CEP", "Cidade", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTableEndereco);
        if (jTableEndereco.getColumnModel().getColumnCount() > 0) {
            jTableEndereco.getColumnModel().getColumn(0).setResizable(false);
            jTableEndereco.getColumnModel().getColumn(1).setResizable(false);
        }

        jTabbedPane1.addTab("Endereco", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 705, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(594, 594, 594))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(546, 546, 546))))
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonSair)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        try {
            // TODO add your handling code here:
            con = ler.restaurar();
        } catch (IOException ex) {
            Logger.getLogger(FrmAlunoBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {            
            // Dados Aluno
            
            //Seto meu modelo de Coluna
            DefaultTableModel modelo = new DefaultTableModel();
            jTableAluno.setModel(modelo);     
            
            //Seto os nomes das colunas 
            modelo.addColumn("Matricula Aluno");
            modelo.addColumn("Nome");
            modelo.addColumn("CPF");
            modelo.addColumn("RG");
            modelo.addColumn("Telefone");
            modelo.addColumn("Celular");
            modelo.addColumn("E-mail");
            modelo.addColumn("Nivel de Acesso");
            modelo.addColumn("Login");
            modelo.addColumn("Data Matricula");
            modelo.addColumn("profissao");
            modelo.addColumn("status");

            //Defini tamanho da coluna
            jTableAluno.getColumnModel().getColumn(0).setPreferredWidth(0);   
            jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(40);   
            jTableAluno.getColumnModel().getColumn(2).setPreferredWidth(20);   
            jTableAluno.getColumnModel().getColumn(3).setPreferredWidth(20);   
            jTableAluno.getColumnModel().getColumn(4).setPreferredWidth(20);   
            jTableAluno.getColumnModel().getColumn(5).setPreferredWidth(20);   
            jTableAluno.getColumnModel().getColumn(6).setPreferredWidth(20);   
            jTableAluno.getColumnModel().getColumn(7).setPreferredWidth(20);   
            jTableAluno.getColumnModel().getColumn(8).setPreferredWidth(0);   
            jTableAluno.getColumnModel().getColumn(9).setPreferredWidth(20);  
            jTableAluno.getColumnModel().getColumn(10).setPreferredWidth(20); 
            jTableAluno.getColumnModel().getColumn(11).setPreferredWidth(20); 
                        
            // Preencho tabela 
            buscar.pesquisaAluno(modelo, con);
            
            // Dados endereco 
            
            DefaultTableModel modelo2 = new DefaultTableModel();
            jTableEndereco.setModel(modelo2);     //é o nome da minha jTable
            
            //Seto nome das colunas 
            modelo2.addColumn("Matricula Aluno");
            modelo2.addColumn("Rua");
            modelo2.addColumn("Numero");
            modelo2.addColumn("Bairro");
            modelo2.addColumn("CEP");
            modelo2.addColumn("Cidade");
            modelo2.addColumn("Estado");
            
            //Defino tamanho 
            jTableEndereco.getColumnModel().getColumn(0).setPreferredWidth(0);   
            jTableEndereco.getColumnModel().getColumn(1).setPreferredWidth(40);    
            jTableEndereco.getColumnModel().getColumn(2).setPreferredWidth(20);   
            jTableEndereco.getColumnModel().getColumn(3).setPreferredWidth(20);  
            jTableEndereco.getColumnModel().getColumn(4).setPreferredWidth(20);    
            jTableEndereco.getColumnModel().getColumn(5).setPreferredWidth(20);   
            jTableEndereco.getColumnModel().getColumn(6).setPreferredWidth(20);   
                        
            //preencho tabela
           buscar.pesquisaEndereco(modelo2, con);

        } catch (Exception e) {
            System.out.println(e);
          
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAlunoBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlunoBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlunoBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlunoBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlunoBuscar().setVisible(true);
            }
        });
    }
    
 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTable jTableEndereco;
    // End of variables declaration//GEN-END:variables
}
