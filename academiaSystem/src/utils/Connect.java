package utils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect implements Serializable {

    private String usuario;
    private String senha;
    private String url;
    private String driver;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Connect() {
    }

    //Metodo de acesso ao banco de dados 
    public  Connection conectaBaseDados(String Driver, String url, String usuario, String senha) {

        try {
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(url, usuario, senha);

            return conn;
        } catch (Exception e) {

            System.out.println("Erro ao realizar a conexÃ£o");
            System.err.println(e);;
            return null;

        }

    }

    //Metodo para fechamento do banco de dados
    public  void desconectaBaseDados(Connection con) {

        try {
            con.close();
        } catch (Exception e) {

            System.out.println("Problemas ao fechar o banco!!");

        }
    }

}
