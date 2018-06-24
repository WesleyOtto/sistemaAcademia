package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Aluno;
import utils.Connect;

public class AlunoDAO {

    public AlunoDAO() {
    }

    // Insere aluno no BD
    public int insereAluno(Aluno aluno, int Usuario_idUsuario, Connect conexao) {
        int matricula = -1;
        try {
            matricula = aluno.getMatriculaAluno();
            //Montar instrução sql
            String strSQL = "";
            strSQL = "INSERT INTO aluno (matriculaAluno, dataMatricula, profissao, status, Usuario_idUsuario) values";
            strSQL = strSQL + "('" + matricula + "',";
            strSQL = strSQL + "'" + aluno.getDataMatricula() + "',";
            strSQL = strSQL + "'" + aluno.getProfissao() + "',";
            strSQL = strSQL + "'" + aluno.getStatus() + "',";
            strSQL = strSQL + "'" + Usuario_idUsuario + "');";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

                return matricula;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        }
    }

    //Metodo para deletar/Aluno
    public boolean deletaAluno(Aluno aluno, Connect conexao) {

        try {

            //Montar instrução sql
            String strSQL = "";
            strSQL = "DELETE FROM aluno WHERE matricula = ";
            strSQL = strSQL + "'" + aluno.getMatriculaAluno() + "';";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.execute(strSQL);
                conexao.desconectaBaseDados(con);

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    //Metodo para atualização dos dados do Aluno
    public boolean atualizaAluno(Aluno aluno, Connect conexao) {

        try {
            //Montar instrução sql
            String strSQL = "";
            strSQL = "UPDATE aluno SET profissao = '" + aluno.getProfissao() + "',";
            strSQL = strSQL + "status = '" + aluno.getStatus() + "',";
            strSQL = strSQL + "dataMatricula = '" + aluno.getDataMatricula() + "'";
            strSQL = strSQL + "WHERE matriculaAluno = '" + aluno.getMatriculaAluno() + "';";

            //Criando objeto da conexão
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                stmt.executeUpdate(strSQL);
                conexao.desconectaBaseDados(con);

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }

    }

    //Metodo para retornar a matricula do aluno desejada
    public ResultSet buscaDadosAluno(int matriculaAluno, Connect conexao) {

        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM aluno ";
            strSQL = strSQL + "WHERE matriculaAluno = '" + matriculaAluno + "';";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);

            }
            return rs;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    //Retorna o próximo Id a ser Adicionado 
    public int retonaIdAluno(Connect conexao) {
        int idAluno = -1;
        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT (max(matriculaAluno) + 1) as id from aluno";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);

            }
            rs.next();
            idAluno = rs.getInt("id");

            return idAluno;
        } catch (Exception e) {
            System.err.println(e);
            return idAluno;
        }

    }

    public ResultSet buscaTodosAluno(Connect conexao) {
        try {

            ResultSet rs = null;
            //Montar a instrução sql
            String strSQL = "";
            strSQL = "SELECT * FROM usuario INNER JOIN aluno ON usuario.idUsuario = aluno.Usuario_idUsuario; ";

            //Realiza a conexao com o banco
            Connection con = conexao.conectaBaseDados(conexao.getDriver(), conexao.getUrl(), conexao.getUsuario(), conexao.getSenha());
            if (con != null) {
                Statement stmt = (Statement) con.createStatement();

                //Executar a instrução sql
                rs = stmt.executeQuery(strSQL);

            }
            return rs;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }

}
