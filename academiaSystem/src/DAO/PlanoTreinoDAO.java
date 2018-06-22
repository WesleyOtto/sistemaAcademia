/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.PlanoTreino;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class PlanoTreinoDAO {

    public PlanoTreinoDAO() {
    }

    //Insere PlanoTreino 
    public int inserePlanoTreino(PlanoTreino plano, int Treino_codTreino, Connect conexao) {
        int codPlanoTreino = -1;
        try {
            codPlanoTreino = plano.getCodPlano();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO planotreino (codPlanoTreino ,series, repeticao, tempoDescanso, observacao, diaSemana, Treino_codTreino) values";
            strSQL = strSQL + "('" + codPlanoTreino + "',";
            strSQL = strSQL + "'" + plano.getSeries() + "',";
            strSQL = strSQL + "'" + plano.getRepeticoes() + "',";
            strSQL = strSQL + "'" + plano.getTempoDescanso() + "',";
            strSQL = strSQL + "'" + plano.getObservacao() + "',";
            strSQL = strSQL + "'" + plano.getDiaSemana() + "',";
            strSQL = strSQL + "'" + Treino_codTreino + "');";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

                return codPlanoTreino;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }

    //Metodo para deletar/PlanoTreino
    public boolean deletaPlanoTreino(PlanoTreino plano, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM planotreino WHERE codPlanoTreino = ";
            strSQL = strSQL + "'" + plano.getCodPlano() + "';";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    //Metodo para atualização dos dados do Treino
    public boolean atualizaPlanoTreino(PlanoTreino plano, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE planotreino SET series = '" + plano.getSeries() + "',";
            strSQL = strSQL + "repeticao = '" + plano.getRepeticoes() + "',";
            strSQL = strSQL + "tempoDescanso = '" + plano.getTempoDescanso() + "'";
            strSQL = strSQL + "observaicao = '" + plano.getObservacao() + "'";
            strSQL = strSQL + "diaSemana = '" + plano.getDiaSemana() + "'";
            strSQL = strSQL + "WHERE codPlanoTreino = '" + plano.getCodPlano() + "';";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.executeUpdate(strSQL);
                conexao.desconectaBaseDados(con);

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    //Metodo para retornar a matricula do Treino desejada
    public ResultSet buscaDadosPlanoTreino(PlanoTreino plano, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM planotreino ";
            strSQL = strSQL + "WHERE codPlanoTreino = '" + plano.getCodPlano() + "';";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);

            }
            return rs;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }

}
