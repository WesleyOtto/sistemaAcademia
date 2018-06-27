/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EnderecoDAO;
import DAO.FuncionarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class FrmFuncionarioBuscarController {

    public FrmFuncionarioBuscarController() {
    }

    public void pesquisaFuncionario(DefaultTableModel modelo, Connect con) throws SQLException {

        //Pesquisa todos os Estados Cadastrados no banco de dados.
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        ResultSet rs = funcionarioDAO.buscaTodosFuncionarios(con);

        //Apresenta todos os estados cadastrado no grid
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("matriculaFuncionario"),
                rs.getString("nome"),
                rs.getString("CPF"),
                rs.getString("RG"),
                rs.getString("telefone"),
                rs.getString("celular"),
                rs.getString("email"),
                rs.getString("nivelAcesso"),
                rs.getString("Acesso_usuario"),
                rs.getString("cargo"),
                rs.getString("salario"),
                rs.getString("dataAdmissao"),
                rs.getString("dataDemissao")
            });
        }

    }

    public void pesquisaEndereco(DefaultTableModel modelo2, Connect con) throws SQLException {
        //Dados Endreco

        EnderecoDAO endereco = new EnderecoDAO();
        ResultSet rsEndereco = null;
        rsEndereco = endereco.buscaEnderecoFuncionario(con);

        while (rsEndereco.next()) {
            modelo2.addRow(new Object[]{
                rsEndereco.getString("matriculaFuncionario"),
                rsEndereco.getString("rua"),
                rsEndereco.getString("numero"),
                rsEndereco.getString("bairro"),
                rsEndereco.getString("CEP"),
                rsEndereco.getString("cidade"),
                rsEndereco.getString("estado")});

        }

    }

}
