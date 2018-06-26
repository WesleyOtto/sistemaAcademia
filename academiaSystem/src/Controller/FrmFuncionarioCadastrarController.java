/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AcessoDAO;
import DAO.FuncionarioDAO;
import DAO.EnderecoDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Acesso;
import model.Funcionario;
import model.Endereco;
import utils.Connect;
import utils.LeituraEscritaConfigBanco;

/**
 *
 * @author wesle
 */
public class FrmFuncionarioCadastrarController {
    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();

    public FrmFuncionarioCadastrarController() {
    }

    public void cadastroFuncionario(Acesso acesso, Funcionario funcionario, Endereco endereco) throws IOException, SQLException {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        AcessoDAO acessoDAO = new AcessoDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        int idUsuario = -1;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Insiro o acesso
        String usuario = acessoDAO.insereAcesso(acesso, con);

        //Insiro o usuario 
        usuarioDAO.insereUsuario(funcionario, usuario, con);

        //buscuo idusuario no BD
        ResultSet rs = usuarioDAO.buscaDadosUsuario(usuario, con);
        rs.next();
        idUsuario = rs.getInt("idUsuario");

        //insere Funcionario
         funcionarioDAO.insereFuncionario(funcionario, idUsuario, con);
       
        //insere endereço
        enderecoDAO.insereEndereco(endereco, idUsuario, con);
    }
    
}
