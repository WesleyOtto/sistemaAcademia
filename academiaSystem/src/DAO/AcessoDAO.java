package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Acesso;
import utils.Connect;

public class AcessoDAO {

    //Metodo para inserção de login/senha
    public AcessoDAO() {
    }

    public boolean insereAcesso(Acesso acesso) {
        System.out.println("entrei");
        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO acesso (usuario, senha) values";
            strSQL = strSQL + " (' " + acesso.getLogin() + " ', ";
            strSQL = strSQL + "' " + acesso.getSenha() + " '); ";
            
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
}
