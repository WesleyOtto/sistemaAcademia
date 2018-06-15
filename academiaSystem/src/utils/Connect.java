package utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "otto1305";
    private static final String URL = "jdbc:mysql://localhost:3306/academiaSystem";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
            
    public Connect() {
    }

    //Metodo de acesso ao banco de dados 
    public Connection conectaBaseDados() {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
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
