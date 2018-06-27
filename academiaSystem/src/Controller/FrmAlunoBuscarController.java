/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AlunoDAO;
import DAO.EnderecoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class FrmAlunoBuscarController {

    public FrmAlunoBuscarController() {
    }

    public void pesquisaAluno(DefaultTableModel modelo, Connect con) throws SQLException {
        //Pesquisa todos os Estados Cadastrados no banco de dados.
        AlunoDAO aluno = new AlunoDAO();
        ResultSet rs = aluno.buscaTodosAluno(con);

        //Apresenta todos os estados cadastrado no grid
        while (rs.next()) {
            modelo.addRow(new Object[]{rs.getString("matriculaAluno"),
                rs.getString("nome"),
                rs.getString("CPF"),
                rs.getString("RG"),
                rs.getString("telefone"),
                rs.getString("celular"),
                rs.getString("email"),
                rs.getString("nivelAcesso"),
                rs.getString("Acesso_usuario"),
                rs.getString("dataMatricula"),
                rs.getString("profissao"),
                rs.getString("status")});

        }

    }

    public void pesquisaEndereco(DefaultTableModel modelo2, Connect con) throws SQLException {
        //Dados Endreco

        EnderecoDAO endereco = new EnderecoDAO();
        ResultSet rsEndereco = null;
        rsEndereco = endereco.buscaEnderecoAluno(con);
                
        while(rsEndereco.next()) {
            modelo2.addRow(new Object[]{
                rsEndereco.getString("matriculaAluno"),
                rsEndereco.getString("rua"),
                rsEndereco.getString("numero"),
                rsEndereco.getString("bairro"),
                rsEndereco.getString("CEP"),
                rsEndereco.getString("cidade"),
                rsEndereco.getString("estado")});

        }
        
    }
}
