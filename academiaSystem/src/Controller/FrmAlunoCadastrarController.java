/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Aluno;
import model.Acesso;
import model.Endereco;
import DAO.AlunoDAO;
import DAO.AcessoDAO;
import DAO.EnderecoDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Connect;
import utils.LeituraEscritaObj;

/**
 *
 * @author wesle
 */
public class FrmAlunoCadastrarController {

    public Connect con = new Connect();
    LeituraEscritaObj ler = new LeituraEscritaObj();

    public FrmAlunoCadastrarController() {
    }

    public void cadastroAluno(Acesso acesso, Aluno aluno, Endereco endereco) throws IOException, SQLException {

        AlunoDAO alunoDAO = new AlunoDAO();
        AcessoDAO acessoDAO = new AcessoDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        int idUsuario = -1;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Insiro o acesso
        String usuario = acessoDAO.insereAcesso(acesso, con);

        //Insiro o usuario 
        usuarioDAO.insereUsuario(aluno, usuario, con);

        //buscuo idusuario no BD
        ResultSet rs = usuarioDAO.buscaDadosUsuario(usuario, con);
        rs.next();
        idUsuario = rs.getInt("idUsuario");

        //insere aluno 
        alunoDAO.insereAluno(aluno, idUsuario, con);

        //insere endereço
        enderecoDAO.insereEndereco(endereco, idUsuario, con);
    }

}
