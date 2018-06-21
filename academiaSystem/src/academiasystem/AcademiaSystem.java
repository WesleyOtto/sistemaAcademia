/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiasystem;

import model.Acesso;
import model.Usuario;
//import utils.Connect;
import DAO.AcessoDAO;
import model.Connect;
import DAO.ConnectDAO;
import view.FrmConnect; 

/**
 *
 * @author wesle
 */
public class AcademiaSystem {

    /**
     * @param args the command line arguments
     */
        
      public AcademiaSystem() {
    }
           
    public static void main(String[] args) {
        
        FrmConnect.main(args);
       //Teste Acesso 
        /*
        Acesso a;
        AcessoDAO acesso = new AcessoDAO();
               
        a = new Acesso();
        a.setLogin("Wesley1w2");
        a.setSenha("12345");
        acesso.insereAcesso(a);  
         */
       
        //Texte Connect model 
       /* Connect con = new Connect();
        String USUARIO = "root";
        String SENHA = "otto1305";
        String URL = "jdbc:mysql://localhost:3306/mydb";
        String DRIVER = "com.mysql.jdbc.Driver";

        if (con.conectaBaseDados(DRIVER, URL, USUARIO, SENHA)!= null) {

            System.out.println("Base de dados conectada!");
        }
        */ 
    }

  
}
