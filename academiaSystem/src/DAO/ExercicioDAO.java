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
import model.Exercicio;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class ExercicioDAO {

    public ExercicioDAO() {
    }
    //Metodo para inserção de Exercicio

    public boolean insereExercicio(Exercicio exercicio, int PlanoTreino_codPlanoTreino) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO exercicio (grupoMuscular, descricaoExercicio, PlanoTreino_codPlanoTreino) values";
            strSQL = strSQL + "('" + exercicio.getGrupoMuscular() + "',";
            strSQL = strSQL + "'" + exercicio.getDescricaoExercicio() + "',";
            strSQL = strSQL + "'" + PlanoTreino_codPlanoTreino + "');";

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

    //Metodo para deletar/Exercicio
    public boolean deletaExercicio(Exercicio exercicio, int codExercicio) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM exercicio WHERE codExercicio = ";
            strSQL = strSQL + "'" + codExercicio + "';";

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

    //Metodo para atualização Exercicio
    public boolean atualizaExercicio(Exercicio exercicio, int codExercicio) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE exercicio SET grupoMuscular = '" + exercicio.getGrupoMuscular() + "'";
            strSQL = strSQL + "carga = " + "'" + exercicio.getCarga() + "',";
            strSQL = strSQL + "descricaoExercicio = " + "'" + exercicio.getDescricaoExercicio() + "',";
            strSQL = strSQL + "WHERE" + "codExercicio = '" + codExercicio + "';";

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

    //Metodo para retornar o Exercicio desejado
    public ResultSet buscaExercicio(Exercicio exercicio, int codExercicio) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            String strSql = "SELECT * FROM exercicio";
            strSQL = strSQL + "WHERE codExercicio = '" + codExercicio + "';";

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
