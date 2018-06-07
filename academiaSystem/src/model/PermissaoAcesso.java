/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author wesle
 */
public class PermissaoAcesso {
    
    private Cargo cargo;
    private int nivelAcesso;
    private String descricao;
    private Funcionario funcionario;
    private Aluno aluno;

    public PermissaoAcesso(Cargo cargo, int nivelAcesso, String descricao, Funcionario funcionario, Aluno aluno) {
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
        this.descricao = descricao;
        this.funcionario = funcionario;
        this.aluno = aluno;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
}
