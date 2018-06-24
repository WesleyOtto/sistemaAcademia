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
public class FrmAlunoAlterarController {

    Aluno aluno = new Aluno();
    AlunoDAO alunoDAO = new AlunoDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Acesso acesso = new Acesso();
    AcessoDAO acessoDAO = new AcessoDAO();
    Endereco endereco = new Endereco();
    EnderecoDAO enderecoDAO = new EnderecoDAO();
    public Connect con = new Connect();
    LeituraEscritaObj ler = new LeituraEscritaObj();
    
    public FrmAlunoAlterarController() {
    }
    
    public Aluno pesquisaAluno(int matriculaAluno) throws IOException, SQLException{
        ResultSet rs = null; 
        ResultSet rs2 = null; 
        
        // Leio o arquivo para Conexao
        con = ler.restaurar();
        
        //Lendo o que tem no bd do aluno
        rs = alunoDAO.buscaDadosAluno(matriculaAluno, con);
        rs.next();
        aluno.setDataMatricula(rs.getString("dataMatricula"));
        aluno.setProfissao(rs.getString("profissao"));
        aluno.setStatus(rs.getString("status"));
        aluno.setIdUsuario(Integer.parseInt(rs.getString("Usuario_idUsuario")));
    
        //Lendo usuario 
        rs2.next();
        rs2 = usuarioDAO.buscaDadosUsuarioId(aluno.getIdUsuario(), con);
        aluno.setNome(rs2.getString("nome"));
        aluno.setCPF(rs2.getString("CPF"));
        aluno.setRG(rs2.getString("RG"));
        aluno.setTelefone(rs2.getString("telefone"));
        aluno.setCelular(rs2.getString("celular"));
        aluno.setEmail(rs2.getString("email"));
        aluno.setNivelAcesso(Integer.parseInt(rs2.getString("nivelAcesso")));
        
        return aluno;
    }
    
    public Acesso pesquisaAcesso (String login) throws IOException, SQLException{
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
  
    public Endereco pesquisaEndereco(int idUsuario) throws SQLException, IOException{
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
}
