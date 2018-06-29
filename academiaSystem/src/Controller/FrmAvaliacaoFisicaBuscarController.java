/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AvaliacaoFisicaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class FrmAvaliacaoFisicaBuscarController {
        public void pesquisaAluno(int idMatricula, DefaultTableModel modelo, Connect con) throws SQLException {
        //Pesquisa todos os Estados Cadastrados no banco de dados.

        AvaliacaoFisicaDAO avaliacaoFisicaDAO = new AvaliacaoFisicaDAO();
        ResultSet rs = avaliacaoFisicaDAO.buscaAvaliacaoFisicaPorIdMatricula(idMatricula, con);

        //Apresenta todos os alunos cadastrado no grid
        while (rs.next()) {
            modelo.addRow(new Object[]{rs.getString("idAvaliacaoFisica"),
                rs.getString("dataAvaliacao"),
                rs.getString("dataVencimentoAvaliacao")});

        }
    }
}
