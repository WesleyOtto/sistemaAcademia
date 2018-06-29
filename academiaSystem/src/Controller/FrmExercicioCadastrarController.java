/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import model.Exercicio;
import DAO.ExercicioDAO;
import java.io.IOException;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;

/**
 *
 * @author wesle
 */
public class FrmExercicioCadastrarController {
    
    ExercicioDAO exercicioDAO = new ExercicioDAO();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();
    public Connect con = new Connect();
    
    public FrmExercicioCadastrarController() {
    }
    
    public void cadastrarExercicio(Exercicio exercicio, int codPlanoTreino) throws IOException{
    
        // Leio o arquivo para Conexao
        con = ler.restaurar();
    
        exercicioDAO.insereExercicio(exercicio, codPlanoTreino, con);
    }
    
}
