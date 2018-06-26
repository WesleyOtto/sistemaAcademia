/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Funcionario;
import model.Acesso;
import model.Endereco;
import DAO.FuncionarioDAO;
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
public class FrmFuncionarioAlterarController {

    Funcionario funcionario = new Funcionario();
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Acesso acesso = new Acesso();
    AcessoDAO acessoDAO = new AcessoDAO();
    Endereco endereco = new Endereco();
    EnderecoDAO enderecoDAO = new EnderecoDAO();
    public Connect con = new Connect();
    LeituraEscritaConfigBanco ler = new LeituraEscritaConfigBanco();

    public FrmFuncionarioAlterarController() {
    }

    public Funcionario pesquisaFuncionario(int matriculaFuncionario) throws IOException, SQLException {

        ResultSet rs = null;

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        //Lendo o que tem no bd do aluno
        rs = funcionarioDAO.buscaFuncionario(matriculaFuncionario, con);

        if (rs != null) {
            rs.next();
            funcionario.setCargo(rs.getString("cargo"));
            funcionario.setSalario(rs.getString("salario"));
            funcionario.setDataAdmissao(rs.getString("dataAdmissao"));
            funcionario.setDataDemissao(rs.getString("dataDemissao"));
            funcionario.setIdUsuario(Integer.parseInt(rs.getString("Usuario_idUsuario")));

            return funcionario;
        } else {
            funcionario = null;
            return funcionario;
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

    public Funcionario pesquisaUsuario() throws SQLException, IOException {
        ResultSet rs = null;
        con = ler.restaurar();

        //Lendo usuario 
        rs = usuarioDAO.buscaDadosUsuarioId(funcionario.getIdUsuario(), con);
        rs.next();
        funcionario.setNome(rs.getString("nome"));
        funcionario.setCPF(rs.getString("CPF"));
        funcionario.setRG(rs.getString("RG"));
        funcionario.setTelefone(rs.getString("telefone"));
        funcionario.setCelular(rs.getString("celular"));
        funcionario.setEmail(rs.getString("email"));
        funcionario.setNivelAcesso(Integer.parseInt(rs.getString("nivelAcesso")));
        funcionario.setAcesso(rs.getString("Acesso_usuario"));

        return funcionario;
    }

    public void alterarFuncionario(Funcionario funcionario) throws IOException {

        // Leio o arquivo para Conexao
        con = ler.restaurar();

        funcionarioDAO.atualizaFuncionario(funcionario, con);
        usuarioDAO.atualizaUsuario(funcionario, con);

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
