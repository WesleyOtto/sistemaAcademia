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
import model.Fatura;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class FaturaDAO {

    public FaturaDAO() {
    }
    // Metodo para inserir dados da Fatura 

    public boolean insereFatura(Fatura fatura, int Funcionario_matriculaFuncionario, int Aluno_matriculaAluno) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO fatura(valor, dataVencimento, dataPagamento, formaPg, "
                    + "status,Funcionario_matriculaFuncionario, Funcionario_matriculaFuncionario) values";
            strSQL = strSQL + "('" + fatura.getValor() + "',";
            strSQL = strSQL + "'" + fatura.getDataVencimento() + "',";
            strSQL = strSQL + "'" + fatura.getDataPagamento() + "',";
            strSQL = strSQL + "'" + fatura.getFormaPg() + "',";
            strSQL = strSQL + "'" + fatura.getStatus() + "',";
            strSQL = strSQL + "'" + Funcionario_matriculaFuncionario + "',";
            strSQL = strSQL + "'" + Aluno_matriculaAluno + "');";

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
    
    //Metodo para deletar/Fatura
    public boolean deletaFatura(Fatura fatura, int idFatura) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM fatura WHERE idFatura = ";
            strSQL = strSQL + "'" + idFatura + "';";

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
    public boolean atualizaFatura(Fatura fatura, int idFatura) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE fatura SET valor = '" + fatura.getValor() + "'";
            strSQL = strSQL + "dataVencimento = " + "'" + fatura.getDataVencimento() + "',";
            strSQL = strSQL + "dataPagamento  = " + "'" + fatura.getDataPagamento()+ "',";
            strSQL = strSQL + "formaPg  = " + "'" + fatura.getFormaPg()+ "',";
            strSQL = strSQL + "status  = " + "'" + fatura.getStatus()+ "',";
            strSQL = strSQL + "WHERE" + "idFatura = '" + idFatura + "';";

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
    public ResultSet buscaFatura(Fatura fatura, int idFatura) {

        try {
            Connect conexao = new Connect();
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM fatura";
            strSQL = strSQL + "WHERE idFatura = '" + idFatura + "';";

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
