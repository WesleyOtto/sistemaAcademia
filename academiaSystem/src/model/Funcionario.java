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
public class Funcionario {
    
    private int matriculaFuncionario;
    private Cargo cargo;
    private double salario;
    private String dataAdmissao;
    private String dataDemissao;
    private PermissaoAcesso permissaoAcesso;
    private AvaliacaoFisica avaliacaoFisica;
    private Exercicio exercicio;
    private Treino treino;
    private Fatura fatura; 
    private Aluno aluno;
    private Funcionario administrador; 

    public Funcionario(int matriculaFuncionario, Cargo cargo, double salario, String dataAdmissao, String dataDemissao, PermissaoAcesso permissaoAcesso, AvaliacaoFisica avaliacaoFisica, Exercicio exercicio, Treino treino, Fatura fatura, Aluno aluno, Funcionario administrador) {
        this.matriculaFuncionario = matriculaFuncionario;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.permissaoAcesso = permissaoAcesso;
        this.avaliacaoFisica = avaliacaoFisica;
        this.exercicio = exercicio;
        this.treino = treino;
        this.fatura = fatura;
        this.aluno = aluno;
        this.administrador = administrador;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public PermissaoAcesso getPermissaoAcesso() {
        return permissaoAcesso;
    }

    public void setPermissaoAcesso(PermissaoAcesso permissaoAcesso) {
        this.permissaoAcesso = permissaoAcesso;
    }

    public AvaliacaoFisica getAvaliacaoFisica() {
        return avaliacaoFisica;
    }

    public void setAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica) {
        this.avaliacaoFisica = avaliacaoFisica;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Funcionario administrador) {
        this.administrador = administrador;
    }
    
    
}
