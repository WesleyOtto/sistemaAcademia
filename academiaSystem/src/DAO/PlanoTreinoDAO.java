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
    public int insereTreino(PlanoTreino plano, int Treino_codTreino) {
        int codPlanoTreino = -1;
        try {
            codPlanoTreino = plano.getCodPlano();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO planotreino (codPlanoTreino ,series, repeticao, tempoDescanso, observacao, diaSemana, Treino_codTreino) values";
            strSQL = strSQL + "('" + codPlanoTreino + "',";
            strSQL = strSQL + "'" + plano.getSeries()+ "',";
            strSQL = strSQL + "'" + plano.getRepeticoes() + "',";
            strSQL = strSQL + "'" + plano.getTempoDescanso() + "',";
            strSQL = strSQL + "'" + plano.getObservacao() + "',";
            strSQL = strSQL + "'" + plano.getDiaSemana() + "',";
            strSQL = strSQL + "'" + Treino_codTreino + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                connect.desconectaBaseDados(con);

                return codPlanoTreino;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }
    
     //Metodo para deletar/Treino
    public boolean deletaTreino(PlanoTreino plano) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM planotreino WHERE codPlanoTreino = ";
            strSQL = strSQL + "'" + plano.getCodPlano() + "';";

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
    
    //Metodo para atualização dos dados do Treino
    public boolean atualizaTreino(PlanoTreino plano) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE planotreino SET series = '" + plano.getSeries()+ "',";
            strSQL = strSQL + "repeticao = '" + plano.getRepeticoes()+ "',";
            strSQL = strSQL + "tempoDescanso = '" + plano.getTempoDescanso() + "'";
            strSQL = strSQL + "observaicao = '" + plano.getObservacao() + "'";
            strSQL = strSQL + "diaSemana = '" + plano.getDiaSemana() + "'";
            strSQL = strSQL + "WHERE codPlanoTreino = '" + plano.getCodPlano() + "';";

            //Criando objeto da conexão
            Connect conect = new Connect();
            Connection con = conect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.executeUpdate(strSQL);
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
    
    //Metodo para retornar a matricula do Treino desejada
    public ResultSet buscaDadosTreino(PlanoTreino plano) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            String strSql = "SELECT * FROM planotreino ";
            strSQL = strSQL + "WHERE codPlanoTreino = '" + plano.getCodPlano()+ "';";

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
