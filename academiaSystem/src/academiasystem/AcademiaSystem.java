/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiasystem;
import utils.Connect;

/**
 *
 * @author wesle
 */
public class AcademiaSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Connect con = new Connect();
              
       if(con.conectaBaseDados() != null) {
           
           System.out.println("Base de dados conectada!");
       }
    }
    
}
