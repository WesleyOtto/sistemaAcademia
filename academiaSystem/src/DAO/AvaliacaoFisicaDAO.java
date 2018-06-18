package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.AvaliacaoFisica;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class AvaliacaoFisicaDAO {

    public AvaliacaoFisicaDAO() {
    }

    //Metodo para inserção de avaliacaoFisica
    public boolean insereAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica, int Funcionario_matriculaFuncionario, int Aluno_matriculaAluno) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO AvaliacaoFisica (gluteos, status, dataAvaliacao, dataVencimentoAvaliacao, "
                    + "coxa, altura, braco, gorduraCorporal, frequenciaCardiaca, abdomem, peso, panturrilha, "
                    + "torax, peito, triceps, supraIliada, subEscapular) VALUES";
            strSQL = strSQL + "('" + avaliacaoFisica.getGluteos() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getStatus() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getDataAvaliacao() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getDataVencimentoAvaliacao() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getCoxa() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getAltura() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getBraco() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getGorduraCorporal() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getFrequenciaCardiaca() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getAbdomem() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getPeso() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getPanturrilha() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getPeito() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getTriceps() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getSupraIliada() + "',";
            strSQL = strSQL + "'" + avaliacaoFisica.getSubEscapular() + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                connect.desconectaBaseDados(con);

                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    //Metodo para deletar/Aluno
    public boolean deletaAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica, int idAvaliacaoFisica) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM avaliacaofisica WHERE idAvaliacaoFisica = ";
            strSQL = strSQL + "'" + idAvaliacaoFisica + "';";

            //Criando objeto da conexão
            Connect conect = new Connect();
            Connection con = conect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conect.desconectaBaseDados(con);

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    //Metodo para retornar a matricula do aluno desejada
    public ResultSet buscaAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica, int matriculaAluno) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            String strSql = "SELECT * FROM aluno";
            strSQL = strSQL + "WHERE Aluno_matriculaAluno = '" + matriculaAluno + "';";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSql);
                conexao.desconectaBaseDados(con);

            }
            return rs;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }
}
