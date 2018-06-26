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
import model.Funcionario;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class FuncionarioDAO {

    public FuncionarioDAO() {
    }

    // Metodo para inserir dados da funcionario 
    public int insereFuncionario(Funcionario funcionario, int Usuario_idUsuario, Connect conexao) {
        int matriculaFuncionario = -1;
        matriculaFuncionario = funcionario.getMatriculaFuncionario();

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO funcionario(matriculaFuncionario, cargo,  "
                    + " salario, dataAdmissao, dataDemissao, Usuario_idUsuario) values ";
            strSQL = strSQL + "('" + matriculaFuncionario + "', ";
            strSQL = strSQL + "'" + funcionario.getCargo() + "', ";
            strSQL = strSQL + "'" + funcionario.getSalario() + "', ";
            strSQL = strSQL + "'" + funcionario.getDataAdmissao() + "', ";
            strSQL = strSQL + "'" + funcionario.getDataDemissao() + "', ";
            strSQL = strSQL + "'" + Usuario_idUsuario + "');";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

                return matriculaFuncionario;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }

    //Metodo para deletar/funcionario
    public boolean deletaFuncionario(Funcionario funcionario, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM funcionario WHERE matriculaFuncionario = ";
            strSQL = strSQL + "'" + funcionario.getMatriculaFuncionario() + "';";

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

    //Metodo para atualização dos dados do funcionario
    public boolean atualizaFuncionario(Funcionario funcionario, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE funcionario SET cargo = '" + funcionario.getCargo() + "', ";
            strSQL = strSQL + "salario = '" + funcionario.getSalario() + "', ";
            strSQL = strSQL + "dataAdmissao = '" + funcionario.getDataAdmissao() + "', ";
            strSQL = strSQL + "dataDemissao = '" + funcionario.getDataDemissao() + "' ";
            strSQL = strSQL + " WHERE matriculaFuncionario = '" + funcionario.getMatriculaFuncionario() + "';";

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

    //Retorna o próximo Id a ser Adicionado 
    public int retonaIdFuncionario(Connect conexao) {
        int idFuncionario = -1;
        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT (max(matriculaFuncionario) + 1) as id from funcionario";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);

            }
            rs.next();
            idFuncionario = rs.getInt("id");

            return idFuncionario;
        } catch (Exception e) {
            System.err.println(e);
            return idFuncionario;
        }

    }

    //Metodo para retornar funcionario
    public ResultSet buscaFuncionario(int matriculaFuncionario, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM funcionario ";
            strSQL = strSQL + " WHERE matriculaFuncionario = '" + matriculaFuncionario + "';";

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
    public ResultSet buscaTodosFuncionarios(Connect conexao) {
        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM usuario INNER JOIN funcionario ON usuario.idUsuario = funcionario.Usuario_idUsuario; ";

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
