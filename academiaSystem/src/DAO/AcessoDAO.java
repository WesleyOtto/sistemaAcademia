package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Acesso;
import utils.Connect;

public class AcessoDAO {

    public AcessoDAO() {
    }
     //Metodo para inserção de login/senha
    public String insereAcesso(Acesso acesso) {
        
        try {
            String login = acesso.getLogin();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO acesso (usuario, senha) values";
            strSQL = strSQL + "('" + login + "',";
            strSQL = strSQL + "'" + acesso.getSenha() + "');";

            //Criando objeto da conexão
            Connect connect = new Connect();
            Connection con = connect.conectaBaseDados();
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                connect.desconectaBaseDados(con);

                return login;
            } else {
                return "Erro no banco";
            }
        } catch (SQLException e) {
            System.err.println(e);
            return "Erro!!!";
        }
    }

    //Metodo para deletar/acesso
    public boolean deletaAcesso(Acesso acesso) {
        
        try {
           
            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM acesso WHERE usuario = ";
            strSQL = strSQL + "'" + acesso.getLogin() + "';";

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

    //Metodo para atualização da senha
    public boolean atualizaSenha(Acesso acesso) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE acesso SET senha = '" + acesso.getSenha() + "'";
            strSQL = strSQL + "WHERE" + "usuario = '" + acesso.getLogin() +"';";
            
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
    
    //Metodo para retornar o acesso desejado
     public ResultSet buscaDadosPessoa(Acesso acesso){
       
       try{
           Connect conexao = new Connect();
           ResultSet rs = null;
           //Montar a instrução sql
           String strSQL = "";
           String strSql = "SELECT * FROM acesso";
           strSQL = strSQL + "WHERE usario = '" + acesso.getLogin()+ "';";
           
            
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
