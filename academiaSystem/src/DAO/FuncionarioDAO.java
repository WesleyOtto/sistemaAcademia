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
    public int insereFuncionario(Funcionario funcionario, int Usuario_idUsuario) {
        int matriculaFuncionario = -1;
        matriculaFuncionario = funcionario.getMatriculaFuncionario();

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO funcionario(matriculaFuncionario, cargo,  "
                    + " salario, dataAdmissao, dataDemissao) values";
            strSQL = strSQL + "('" + matriculaFuncionario + "',";
            strSQL = strSQL + "'" + funcionario.getCargo() + "',";
            strSQL = strSQL + "'" + funcionario.getSalario() + "',";
            strSQL = strSQL + "'" + funcionario.getDataAdmissao() + "',";
            strSQL = strSQL + "'" + funcionario.getDataDemissao() + "',";
            strSQL = strSQL + "'" + Usuario_idUsuario + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                connect.desconectaBaseDados(con);

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
    public boolean deletaFuncionario(Funcionario funcionario) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM funcionario WHERE matriculaFuncionario = ";
            strSQL = strSQL + "'" + funcionario.getMatriculaFuncionario() + "';";

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

    //Metodo para atualização dos dados do funcionario
    public boolean atualizaFuncionario(Funcionario funcionario) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE funcionario SET cargo = '" + funcionario.getCargo() + "',";
            strSQL = strSQL + "salario = '" + funcionario.getSalario() + "'";
            strSQL = strSQL + "dataAdmissao = '" + funcionario.getDataAdmissao() + "'";
            strSQL = strSQL + "dataDemissao = '" + funcionario.getDataDemissao() + "'";
            strSQL = strSQL + "WHERE matriculaFuncionario = '" + funcionario.getMatriculaFuncionario() + "';";

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

    //Metodo para retornar funcionario
    public ResultSet buscaFuncionario(Funcionario funcionario) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM funcionario";
            strSQL = strSQL + "WHERE matriculaFuncionario = '" + funcionario.getMatriculaFuncionario() + "';";

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
