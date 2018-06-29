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
public class Funcionario extends Usuario {

    private int matriculaFuncionario;
    private String cargo;
    private String descricaoCargo;
    private String salario;
    private String dataAdmissao;
    private String dataDemissao;
    private AvaliacaoFisica avaliacaoFisica;
    private Exercicio exercicio;
    private Treino treino;
    private Fatura fatura;
    private Aluno aluno;
    private Funcionario administrador;

    public Funcionario(int matriculaFuncionario, String cargo, String descricaoCargo, String salario, String dataAdmissao, String dataDemissao, AvaliacaoFisica avaliacaoFisica, Exercicio exercicio, Treino treino, Fatura fatura, Aluno aluno, Funcionario administrador, int idUsuario, String acesso, String CPF, String RG, String nome, String telefone, String celular, String email, char sexo, int nivelAcesso, String dataNascimento, String estadoCivil, String foto) {
        super(idUsuario, acesso, CPF, RG, nome, telefone, celular, email, nivelAcesso, dataNascimento, estadoCivil, foto);
        this.matriculaFuncionario = matriculaFuncionario;
        this.cargo = cargo;
        this.descricaoCargo = descricaoCargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.avaliacaoFisica = avaliacaoFisica;
        this.exercicio = exercicio;
        this.treino = treino;
        this.fatura = fatura;
        this.aluno = aluno;
        this.administrador = administrador;
    }

    public Funcionario(int matriculaFuncionario, String cargo, String descricaoCargo, String salario, String dataAdmissao, String dataDemissao, AvaliacaoFisica avaliacaoFisica, Exercicio exercicio, Treino treino, Fatura fatura, Aluno aluno, Funcionario administrador) {
        this.matriculaFuncionario = matriculaFuncionario;
        this.cargo = cargo;
        this.descricaoCargo = descricaoCargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.avaliacaoFisica = avaliacaoFisica;
        this.exercicio = exercicio;
        this.treino = treino;
        this.fatura = fatura;
        this.aluno = aluno;
        this.administrador = administrador;
    }

    public Funcionario() {
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
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
