/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AvaliacaoFisicaDAO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.AvaliacaoFisica;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;

/**
 *
 * @author wesle
 */
public class FrmAvaliacaoFisicaRelatorioController {

    AvaliacaoFisica avaliacao = new AvaliacaoFisica();
    AvaliacaoFisicaDAO avaliacaoDAO = new AvaliacaoFisicaDAO();
    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();

    public FrmAvaliacaoFisicaRelatorioController() {
    }

    public AvaliacaoFisica buscaAvaliacaoIdAvaliacao(int idAvaliacao) throws IOException, SQLException {
        ResultSet rs = null;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Busco a AvaliacaoFisica no bd
        rs = avaliacaoDAO.buscaAvaliacaoFisica(avaliacao, idAvaliacao, con);
        if (rs != null) {
            rs.next();
            avaliacao.setGluteos(Double.parseDouble(rs.getString("gluteos")));
            avaliacao.setDataAvaliacao(rs.getString("dataAvaliacao"));
            avaliacao.setDataVencimentoAvaliacao(rs.getString("dataVencimentoAvaliacao"));
            avaliacao.setCoxa(Double.parseDouble(rs.getString("coxa")));
            avaliacao.setAltura(Double.parseDouble(rs.getString("altura")));
            avaliacao.setBraco(Double.parseDouble(rs.getString("braco")));
            avaliacao.setGorduraCorporal(Double.parseDouble(rs.getString("gorduraCorporal")));
            avaliacao.setFrequenciaCardiaca(Double.parseDouble(rs.getString("frequenciaCardiaca")));
            avaliacao.setAbdomem(Double.parseDouble(rs.getString("abdomem")));
            avaliacao.setPeso(Double.parseDouble(rs.getString("peso")));
            avaliacao.setPanturrilha(Double.parseDouble(rs.getString("panturrilha")));
            avaliacao.setTorax(Double.parseDouble(rs.getString("torax")));
            avaliacao.setPeito(Double.parseDouble(rs.getString("peito")));
            avaliacao.setTriceps(Double.parseDouble(rs.getString("triceps")));
            avaliacao.setSupraIliada(Double.parseDouble(rs.getString("supraIliada")));
            avaliacao.setSubEscapular(Double.parseDouble(rs.getString("subEscapular")));

        }

        return avaliacao;
    }

    public int buscaAvaliacaoIdAvaliacaoAluno(int idAvaliacao) throws IOException, SQLException {
        ResultSet rs = null;
        int idMatricula = -1;
        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Busco a AvaliacaoFisica no bd
        rs = avaliacaoDAO.buscaAvaliacaoFisica(avaliacao, idAvaliacao, con);

        if (rs != null) {
            rs.next();
            idMatricula = Integer.parseInt(rs.getString("Aluno_matriculaAluno"));
        }
        return idMatricula;
    }

    
}
