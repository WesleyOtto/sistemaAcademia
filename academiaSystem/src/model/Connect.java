package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    private static String usuario;
    private static String senha;
    private static String url;
    private static String driver;

    public Connect() {
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Connect.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Connect.senha = senha;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Connect.url = url;
    }

    public static String getDriver() {
        return driver;
    }

    public static void setDriver(String driver) {
        Connect.driver = driver;
    }

    //Metodo de acesso ao banco de dados 
    public Connection conectaBaseDados(String Driver, String url, String usuario, String senha) {

        try {
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(url, usuario, senha);
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
