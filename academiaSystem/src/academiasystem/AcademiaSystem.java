/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiasystem;
import model.Acesso;
import model.Usuario;
import utils.Connect;
import DAO.AcessoDAO;

/**
 *
 * @author wesle
 */
public class AcademiaSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Acesso a;
        AcessoDAO acesso = new AcessoDAO();
               
        a = new Acesso();
        a.setLogin("Wesley1");
        a.setSenha("12345");
        acesso.insereAcesso(a);  
    
    }
 }
