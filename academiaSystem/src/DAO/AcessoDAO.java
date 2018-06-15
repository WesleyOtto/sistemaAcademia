package DAO;
import java.sql.Connection;
import java.sql.Statement;
import model.Acesso;
import utils.Connect;

public class AcessoDAO {
    
    //Metodo para inserção de login/senha
    
    public boolean insereAcesso(Acesso acesso){
       
       try{
           //Montar instrução sql
           String strSQL = "";
           strSQL = "INSERT INTO acesso (usuario, senha) values";
           strSQL = strSQL + " (' " + acesso.getLogin() + " '), ";
           strSQL = strSQL + " (' " + acesso.getSenha() + " '); ";
           
           //Criando objeto da conexão
           Connect conect = new Connect();
           Connection con = conect.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               stmt.execute(strSQL);
               conect.desconectaBaseDados(con);
             
             return true;
           }else{
               return false;
           }  
       }
       catch (Exception e){
           
           return false;
       }   
        
    }  
}
