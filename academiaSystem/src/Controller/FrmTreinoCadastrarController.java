/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AcessoDAO;
import DAO.AlunoDAO;
import DAO.TreinoDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Acesso;
import model.Treino;
import model.Aluno;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;

/**
 *
 * @author wesle
 */
public class FrmTreinoCadastrarController {

    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();

    public FrmTreinoCadastrarController() {
    }

    public void cadastroTreino(Treino treino, int matriculaAluno) throws IOException, SQLException {

        TreinoDAO treinoDAO = new TreinoDAO();
        int retorno;

        // Leio o arquivo para Conexao
        con = ler.restaurar();
        
        //Insiro meu Treino
        treinoDAO.insereTreino(treino, matriculaAluno, con);
    }

}
