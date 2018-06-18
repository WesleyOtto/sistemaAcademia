/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Connect;

/**
 *
 * @author wesle
 */
public class ConnectDAO {

    public ConnectDAO() {
    }
    //Metodo para inserção de dados do BD

    public boolean insereDadosBD(String usuario, String senha, String url, String driver) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO acesso (usuario, senha, url, driver) values";
            strSQL = strSQL + "('" + usuario + "',";
            strSQL = strSQL + "'" + senha + "',";
            strSQL = strSQL + "'" + url + "',";
            strSQL = strSQL + "'" + driver + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados(usuario, senha, url, driver);
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

    //Metodo para deletar dados do BD
    public boolean deletaAcesso(int idConnection, String usuario, String senha, String url, String driver) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM connection WHERE idConnection = ";
            strSQL = strSQL + "'" + idConnection + "';";

            //Criando objeto da conexão
            Connect conect = new Connect();
            Connection con = conect.conectaBaseDados(usuario, senha, url, driver);
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

    //Metodo para atualização dados do BD
    public boolean atualizaSenha(int idConnection, String usuario, String senha, String url, String driver) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE connection SET usuario = '" + usuario + "'";
            strSQL = strSQL + "senha = " + "'" + senha + "',";
            strSQL = strSQL + "url = " + "'" + url + "',";
            strSQL = strSQL + "DRIVER = " + "'" + driver + "');";
            strSQL = strSQL + "WHERE" + "idConnection = '" + idConnection + "';";

            //Criando objeto da conexão
            Connect conect = new Connect();
            Connection con = conect.conectaBaseDados(usuario, senha, url, driver);
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

    //Metodo para retornar o dados do BD
    public ResultSet buscaDadosPessoa(int idConnection, String usuario, String senha, String url, String driver) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            String strSql = "SELECT * FROM connection";
            strSQL = strSQL + "WHERE idConnection = '" + idConnection+ "';";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(usuario, senha, url, driver);
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
