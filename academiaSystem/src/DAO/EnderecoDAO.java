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
import model.Endereco;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class EnderecoDAO {

    public EnderecoDAO() {
    }

    //Metodo para inserção de Endereco
    public boolean insereEndereco(Endereco endereco, int Usuario_idUsuario) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO endereco (rua, numero, bairro, CEP, cidade, estado, Usuario_idUsuario) values";
            strSQL = strSQL + "('" + endereco.getRua() + "',";
            strSQL = strSQL + "'" + endereco.getNumero() + "',";
            strSQL = strSQL + "'" + endereco.getBairro() + "',";
            strSQL = strSQL + "'" + endereco.getCEP() + "',";
            strSQL = strSQL + "'" + endereco.getCidade() + "',";
            strSQL = strSQL + "'" + endereco.getEstado() + "',";
            strSQL = strSQL + "'" + Usuario_idUsuario + "');";

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

    //Metodo para deletar/Endereco
    public boolean deletaEndereco(Endereco endereco, int idEndereco) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM endereco WHERE idEndereco = ";
            strSQL = strSQL + "'" + idEndereco + "';";

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

    //Metodo para atualização da Endereco
    public boolean atualizaEndereco(Endereco endereco, int Usuario_idUsuario) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE endereco SET rua = '" + endereco.getRua() + "',";
            strSQL = strSQL + "numero = " + "'" + endereco.getNumero() + "',";
            strSQL = strSQL + "bairro = " + "'" + endereco.getBairro() + "',";
            strSQL = strSQL + "CEP    = " + "'" + endereco.getCEP() + "',";
            strSQL = strSQL + "cidade = " + "'" + endereco.getCidade() + "',";
            strSQL = strSQL + "estado = " + "'" + endereco.getEstado() + "',";
            strSQL = strSQL + "WHERE Usuario_idUsuario = '" + Usuario_idUsuario + "';";

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
    
     //Metodo para retornar Endereco dado o id do usuario
    public ResultSet buscaEndereco(Endereco endereco, int Usuario_idUsuario) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            String strSql = "SELECT * FROM endereco";
            strSQL = strSQL + "WHERE Usuario_idUsuario = '" + Usuario_idUsuario + "';";

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