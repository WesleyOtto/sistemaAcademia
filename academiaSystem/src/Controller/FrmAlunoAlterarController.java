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
import utils.LeituraEscritaConfigBanco;

/**
 *
 * @author wesle
 */
public class FrmAlunoAlterarController {

    Aluno aluno = new Aluno();
    AlunoDAO alunoDAO = new AlunoDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Acesso acesso = new Acesso();
    AcessoDAO acessoDAO = new AcessoDAO();
    Endereco endereco = new Endereco();
    EnderecoDAO enderecoDAO = new EnderecoDAO();
    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();

    public FrmAlunoAlterarController() {
    }

    public Aluno pesquisaAluno(int matriculaAluno) throws IOException, SQLException {

        ResultSet rs = null;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Lendo o que tem no bd do aluno
        rs = alunoDAO.buscaDadosAluno(matriculaAluno, con);
        
        //Coloco em um obj aluno os dados do meu BD
        if (rs != null) {
            rs.next();
            aluno.setDataMatricula(rs.getString("dataMatricula"));
            aluno.setProfissao(rs.getString("profissao"));
            aluno.setStatus(rs.getString("status"));
            aluno.setIdUsuario(Integer.parseInt(rs.getString("Usuario_idUsuario")));
            return aluno;
        } else {
            aluno = null;
            return aluno;
        }

    }

    public Acesso pesquisaAcesso(String login) throws IOException, SQLException {

        ResultSet rs = null;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        acesso.setLogin(login);

        //Lendo o que tem no bd do Acesso
        rs = acessoDAO.buscaDadosPessoa(login, con);
        rs.next();
        acesso.setSenha(rs.getString("senha"));

        return acesso;
    }

    public Endereco pesquisaEndereco(int idUsuario) throws SQLException, IOException {
        ResultSet rs = null;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Lendo o que tem no bd do Acesso
        rs = enderecoDAO.buscaEndereco(idUsuario, con);
        rs.next();
        endereco.setRua(rs.getString("rua"));
        endereco.setNumero(Integer.parseInt(rs.getString("numero")));
        endereco.setBairro(rs.getString("bairro"));
        endereco.setCEP(rs.getString("CEP"));
        endereco.setCidade(rs.getString("cidade"));
        endereco.setEstado(rs.getString("Estado"));

        return endereco;

    }

    public Aluno pesquisaUsuario() throws SQLException, IOException {
        ResultSet rs = null;
        con = ler.restaurar();

        //Lendo usuario 
        rs = usuarioDAO.buscaDadosUsuarioId(aluno.getIdUsuario(), con);
        rs.next();
        aluno.setNome(rs.getString("nome"));
        aluno.setCPF(rs.getString("CPF"));
        aluno.setRG(rs.getString("RG"));
        aluno.setTelefone(rs.getString("telefone"));
        aluno.setCelular(rs.getString("celular"));
        aluno.setEmail(rs.getString("email"));
        aluno.setNivelAcesso(Integer.parseInt(rs.getString("nivelAcesso")));
        aluno.setAcesso(rs.getString("Acesso_usuario"));

        return aluno;
    }

    public void alterarAluno(Aluno aluno) throws IOException {

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        alunoDAO.atualizaAluno(aluno, con);
        usuarioDAO.atualizaUsuario(aluno, con);

    }

    public void alterarAcesso(Acesso acesso) throws IOException {
        // Leio o arquivo para Conexao
        con = ler.restaurar();
        acessoDAO.atualizaSenha(acesso, con);

    }

    public void alterarEndereco(Endereco endereco, Acesso acesso) throws IOException, SQLException {
        ResultSet rs = null;
        int idUsuario = -1;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Lendo o que tem no bd do Acesso
        rs = usuarioDAO.buscaDadosUsuario(acesso.getLogin(), con);
        rs.next();
        idUsuario = rs.getInt("idUsuario");
        enderecoDAO.atualizaEndereco(endereco, idUsuario, con);

    }
}
