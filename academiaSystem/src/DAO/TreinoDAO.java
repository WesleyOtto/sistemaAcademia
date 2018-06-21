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
import model.Treino;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class TreinoDAO {

    // Insere Treino no BD
    public int insereTreino(Treino treino, int Aluno_matriculaAluno) {
        int codTreino = -1;
        try {
            codTreino = treino.getCodTreino();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO treino (codTreino, descricaoTreino, tipoTreino, objetivo, Aluno_matriculaAluno) values";
            strSQL = strSQL + "('" + codTreino + "',";
            strSQL = strSQL + "'" + treino.getDescricaoTreino() + "',";
            strSQL = strSQL + "'" + treino.getTipoTreino() + "',";
            strSQL = strSQL + "'" + treino.getObjetivo() + "',";
            strSQL = strSQL + "'" + Aluno_matriculaAluno + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                connect.desconectaBaseDados(con);

                return codTreino;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }

    //Metodo para deletar/Treino
    public boolean deletaTreino(Treino treino) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM treino WHERE codTreino = ";
            strSQL = strSQL + "'" + treino.getCodTreino() + "';";

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
    public boolean atualizaTreinoo(Treino treino) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE treino SET descricaoTreino = '" + treino.getDescricaoTreino() + "',";
            strSQL = strSQL + "tipoTreino = '" + treino.getTipoTreino() + "',";
            strSQL = strSQL + "objetivo = '" + treino.getObjetivo() + "'";
            strSQL = strSQL + "WHERE codTreino = '" + treino.getCodTreino() + "';";

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
    
        //Metodo para retornar a matricula do treino desejada
    public ResultSet buscatreino(Treino treino) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM treino";
            strSQL = strSQL + "WHERE codTreino = '" + treino.getCodTreino()+ "';";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);
                conexao.desconectaBaseDados(con);

            }
            return rs;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }

}
