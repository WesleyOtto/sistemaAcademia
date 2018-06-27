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
    public boolean insereEndereco(Endereco endereco, int Usuario_idUsuario, Connect conexao) {
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
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    //Metodo para deletar/Endereco
    public boolean deletaEndereco(Endereco endereco, int idEndereco, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM endereco WHERE idEndereco = ";
            strSQL = strSQL + "'" + idEndereco + "';";

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

    //Metodo para atualização da Endereco
    public boolean atualizaEndereco(Endereco endereco, int Usuario_idUsuario, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE endereco SET rua = '" + endereco.getRua() + "',";
            strSQL = strSQL + "numero = " + "'" + endereco.getNumero() + "',";
            strSQL = strSQL + "bairro = " + "'" + endereco.getBairro() + "',";
            strSQL = strSQL + "CEP    = " + "'" + endereco.getCEP() + "',";
            strSQL = strSQL + "cidade = " + "'" + endereco.getCidade() + "',";
            strSQL = strSQL + "estado = " + "'" + endereco.getEstado() + "' ";
            strSQL = strSQL + "WHERE Usuario_idUsuario = '" + Usuario_idUsuario + "';";

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

    //Metodo para retornar Endereco dado o id do usuario
    public ResultSet buscaEndereco(int Usuario_idUsuario, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM endereco ";
            strSQL = strSQL + "WHERE Usuario_idUsuario = '" + Usuario_idUsuario + "';";

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

    //Metodo para retornar Endereco Do aluno
    public ResultSet buscaEnderecoAluno(Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM endereco inner join aluno where aluno.Usuario_idUsuario = endereco.Usuario_idUsuario ;";

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

    //Metodo para retornar Endereco Do funcionario
    public ResultSet buscaEnderecoFuncionario(Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM endereco inner join funcionario where funcionario.Usuario_idUsuario = endereco.Usuario_idUsuario ;";

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
