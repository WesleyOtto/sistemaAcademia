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
import model.Usuario;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class UsuarioDAO {

    public UsuarioDAO() {
    }
    // Insere aluno no BD

    public int insereUsuario(Usuario usuario, String Acesso_usuario, Connect conexao) {
        int idUsuario = -1;
        try {
            idUsuario = usuario.getIdUsuario();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO usuario (idUsuario, nome, CPF, RG, telefone, celular, email, nivelAcesso, Acesso_usuario) values";
            strSQL = strSQL + "('" + idUsuario + "',";
            strSQL = strSQL + "'" + usuario.getNome() + "',";
            strSQL = strSQL + "'" + usuario.getCPF() + "',";
            strSQL = strSQL + "'" + usuario.getRG() + "',";
            strSQL = strSQL + "'" + usuario.getTelefone() + "',";
            strSQL = strSQL + "'" + usuario.getCelular() + "',";
            strSQL = strSQL + "'" + usuario.getEmail() + "',";
            strSQL = strSQL + "'" + usuario.getNivelAcesso() + "',";
            strSQL = strSQL + "'" + Acesso_usuario + "');";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

                return idUsuario;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }

    //Metodo para deletar/Usuario
    public boolean deletaUsuario(Usuario usuario, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM usuario WHERE idUsuario = ";
            strSQL = strSQL + "'" + usuario.getIdUsuario() + "';";

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

    //Metodo para atualização dos dados do Usuario
    public boolean atualizaUsuario(Usuario usuario, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE usuario SET nome = '" + usuario.getNome() + "',";
            strSQL = strSQL + "CPF = '" + usuario.getCPF() + "',";
            strSQL = strSQL + "RG = '" + usuario.getRG() + "',";
            strSQL = strSQL + "telefone = '" + usuario.getTelefone() + "',";
            strSQL = strSQL + "celular = '" + usuario.getCelular() + "',";
            strSQL = strSQL + "email = '" + usuario.getEmail() + "',";
            strSQL = strSQL + "nivelAcesso = '" + usuario.getNivelAcesso() + "' ";
            strSQL = strSQL + "WHERE idUsuario = '" + usuario.getIdUsuario() + "';";
            
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

    //Metodo para retornar o Usuario
    public ResultSet buscaDadosUsuarioId(int idUsuario, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM usuario ";
            strSQL = strSQL + "WHERE idUsuario = '" + idUsuario + "';";

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

    //Metodo para retornar o Usuario
    public ResultSet buscaDadosUsuario(String Acesso_usuario, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM usuario ";
            strSQL = strSQL + " WHERE Acesso_usuario = '" + Acesso_usuario + "';";

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
