package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Acesso;
import model.Connect;

public class AcessoDAO {

    public AcessoDAO() {
    }
    //Metodo para inserção de login/senha

    public String insereAcesso(Acesso acesso, Connect conexao) {

        try {
            String login = acesso.getLogin();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO acesso (usuario, senha) values";
            strSQL = strSQL + "('" + login + "',";
            strSQL = strSQL + "'" + acesso.getSenha() + "');";

            //Criando objeto da conexão
            
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

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
    public boolean deletaAcesso(Acesso acesso, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM acesso WHERE usuario = ";
            strSQL = strSQL + "'" + acesso.getLogin() + "';";

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

    //Metodo para atualização da senha
    public boolean atualizaSenha(Acesso acesso, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE acesso SET senha = '" + acesso.getSenha() + "'";
            strSQL = strSQL + "WHERE" + "usuario = '" + acesso.getLogin() + "';";

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

    //Metodo para retornar o acesso desejado
    public ResultSet buscaDadosPessoa(String login, Connect conexao) {

        try {
            
            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM acesso ";
            strSQL = strSQL + "WHERE usuario = '" + login + "';";

            //Realiza a conexao com o banco 
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);
                return rs;
            }
            return rs;
        } 
        catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }

}
