package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Aluno;
import utils.Connect;

public class AlunoDAO {

    // Insere aluno no BD
    public int insereAcesso(Aluno aluno, int Usuario_idUsuario) {
        int matricula = -1;
        try {
            matricula = aluno.getMatriculaAluno(); 
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO aluno (dataMatricula, profissao, status, Usuario_idUsuario) values";
            strSQL = strSQL + "('" + matricula + "',";
            strSQL = strSQL + "'" + aluno.getProfissao() + "',";
            strSQL = strSQL + "'" + aluno.getStatus() + "',";
            strSQL = strSQL + "'" + Usuario_idUsuario + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                connect.desconectaBaseDados(con);

                return matricula;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }
    
    //Metodo para deletar/Aluno
    public boolean deletaAcesso(Aluno aluno) {
        
        try {
           
            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM aluno WHERE matricula = ";
            strSQL = strSQL + "'" + aluno.getMatriculaAluno() + "';";

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
    
    //Metodo para atualização dos dados do Aluno
    public boolean atualizaAluno(Aluno aluno, int matricula) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE aluno SET profissao = '" + aluno.getProfissao() + "',";
            strSQL = strSQL + "status = '" + aluno.getStatus()+ "',";
            strSQL = strSQL + "status = '" + aluno.getDataMatricula()+ "'";
            strSQL = strSQL + "WHERE matriculaAluno = '" + matricula+ "';";

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
    
     //Metodo para retornar a matricula do aluno desejada
     public ResultSet buscaDadosPessoa(Aluno aluno){
       
       try{
           Connect conexao = new Connect();
           ResultSet rs = null;
           //Montar a instrução sql
           String strSQL = "";
           String strSql = "SELECT * FROM aluno";
           strSQL = strSQL + "WHERE matriculaAluno = '" + aluno.getMatriculaAluno()+ "';";
           
            //Realiza a conexao com o banco
           Connection con = conexao.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               rs = stmt.executeQuery(strSql);
               conexao.desconectaBaseDados(con);
             
            }
           return rs;
       }
       catch (Exception e){
           System.err.println(e);
           return null;
       }   
        
    } 
}
