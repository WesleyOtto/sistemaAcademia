/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AvaliacaoFisicaDAO;
import java.io.IOException;
import model.AvaliacaoFisica;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;

/**
 *
 * @author wesle
 */
public class FrmAvaliacaoFisicaController {

    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();
    AvaliacaoFisicaDAO avaliacaoDAO = new AvaliacaoFisicaDAO();

    public FrmAvaliacaoFisicaController() {
    }

    public void inserirAvaliacaoFisica(int matriculaAluno, int matriculaFuncionario, AvaliacaoFisica avaliacao) throws IOException {
        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //insiro os dados no bd
        avaliacaoDAO.insereAvaliacaoFisica(avaliacao, matriculaFuncionario, matriculaAluno, con);

    }

}
