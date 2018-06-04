package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    public Connect() {
    }

    //Metodo de acesso ao banco de dados 
    public Connection conectaBaseDados() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String strUrl = "jdbc:mysql://localhost:3306/notcontroleestoque";
            Connection conn = DriverManager.getConnection(strUrl, "root", "otto1305");
            return conn;
        } catch (Exception e) {

            System.out.println("Erro ao realizar a conexÃ£o");
            e.printStackTrace();
            return null;

        }

    }

    //Metodo para fechamento do banco de dados
    public void desconectaBaseDados(Connection con) {

        try {
            con.close();
        } catch (Exception e) {

            System.out.println("Problemas ao fechar o banco!!");

        }
    }

}
