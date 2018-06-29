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
    public int insereTreino(Treino treino, int Aluno_matriculaAluno, Connect conexao) {
        int codTreino = -1;
        try {
            codTreino = treino.getCodTreino();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO treino (descricaoTreino, objetivo, Aluno_matriculaAluno) values ";
            strSQL = strSQL + "('" + treino.getDescricaoTreino() + "',";
            strSQL = strSQL + "'" + treino.getObjetivo() + "',";
            strSQL = strSQL + "'" + Aluno_matriculaAluno + "');";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

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
    public boolean deletaTreino(Treino treino, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM treino WHERE codTreino = ";
            strSQL = strSQL + "'" + treino.getCodTreino() + "';";

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
    public boolean atualizaTreinoo(Treino treino, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE treino SET descricaoTreino = '" + treino.getDescricaoTreino() + "',";
            strSQL = strSQL + "tipoTreino = '" + treino.getTipoTreino() + "',";
            strSQL = strSQL + "objetivo = '" + treino.getObjetivo() + "'";
            strSQL = strSQL + "WHERE codTreino = '" + treino.getCodTreino() + "';";

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

    public int retornacodTreino(Connect conexao) {
        int matricula = -1;
        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT (max(codTreino) + 1) as id from treino";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);

            }
            rs.next();
            matricula = rs.getInt("id");
            return matricula;
        } catch (Exception e) {
            System.err.println(e);
            return matricula;
        }

    }

    //Metodo para retornar a matricula do treino desejada
    public ResultSet buscatreino(Treino treino, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM treino ";
            strSQL = strSQL + "WHERE codTreino = '" + treino.getCodTreino() + "';";

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
