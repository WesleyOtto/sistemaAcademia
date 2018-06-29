/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PlanoTreinoDAO;
import java.io.IOException;
import model.PlanoTreino;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;
        

/**
 *
 * @author wesle
 */
public class FrmPlanoTreinoCadastrarController {
    
    
    PlanoTreinoDAO planoTreinoDAO = new PlanoTreinoDAO();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();
    public Connect con = new Connect();

    public FrmPlanoTreinoCadastrarController() {
    }
    
    public void inserePlanoTreino (PlanoTreino planoTreino, int Treino_codTreino) throws IOException{
    
    con = ler.restaurar();
    planoTreinoDAO.inserePlanoTreino(planoTreino, Treino_codTreino, con);
    
    }
    
    
}
