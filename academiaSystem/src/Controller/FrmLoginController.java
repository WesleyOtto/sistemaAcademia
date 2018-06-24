/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AcessoDAO;
import DAO.UsuarioDAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Acesso;
import utils.Connect;
import utils.LeituraEscritaObj;
import view.FrmPrincipalAdm;
//import view.FrmPrincipalAluno;
//import view.FrmPrincipalInstrutor;
//import view.FrmPrincipalSecretaria;

/**
 *
 * @author wesle
 */
public class FrmLoginController {

    public Connect con = new Connect();
    LeituraEscritaObj ler = new LeituraEscritaObj();
    private String args[] = {""};
    AcessoDAO acessaDAO = new AcessoDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Acesso acesso = new Acesso();
    boolean login = false;
    int nivelAcesso = -1;

    public FrmLoginController() {
    }

    //Verifica se o Login e a senha Estão corretas !
    public boolean loginAcesso(String usuario, String senha) {
        try {
            String usuarioBD = "";
            String senhaBD = "";

            //Leio o arquivo TXT e retorno um obj que é muinha configuração do BD
            con = ler.restaurar();

            // Busco se existe o usuario passado 
            ResultSet dadosAcesso = acessaDAO.buscaDadosPessoa(usuario, con);

            // Jogo meus dados buscados nas minhas variáveis 
            while (dadosAcesso.next()) {
                usuarioBD = dadosAcesso.getString("usuario");
                senhaBD = dadosAcesso.getString("senha");
            }

            //Chamo a regra de negócio, 
            login = acesso.acessarSistema(usuario, senha, usuarioBD, senhaBD);

            // Se o usuario e senha estiver correta, passo para a próxima tela 
            if (login) {

                JOptionPane.showMessageDialog(null, "Usuario: " + usuario + System.lineSeparator() + System.lineSeparator() + "Seja, Bem Vindo!!", "Bem Vindo", JOptionPane.INFORMATION_MESSAGE);

                ResultSet nivel = usuarioDAO.buscaDadosUsuario(usuarioBD, con);
                
                while (nivel.next()) {
                    nivelAcesso = nivel.getInt("nivelAcesso");
                }

                switch (nivelAcesso) {
                    //Se nivel de acesso = 1, chamo a tela de adm
                    case 1:
                        FrmPrincipalAdm.main(args);
                        break;
                    //Se nivel de acesso = 2, chamo a tela de secretária
                    case 2:
                      //  FrmPrincipalSecretaria.main(args);
                        break;
                        //Se nivel de acesso = 3, chamo a tela de instrutor
                    case 3:
                     //   FrmPrincipalInstrutor.main(args);
                        break;
                        //Se nivel de acesso = 4, chamo a tela de aluno
                    case 4:
                     //   FrmPrincipalAluno.main(args);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error!!!" + JOptionPane.ERROR_MESSAGE);
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            return login; 
        } catch (Exception e) {
            System.err.println(e);;
        }
        return login;
    }
}
