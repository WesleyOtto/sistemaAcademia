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
public class Fatura {
    
    private int idFatura;
    private double valor;
    private String dataVencimento;
    private String dataPagamento;
    private String formaPg;
    private String status;
    private Aluno aluno;
    private Funcionario secretaria;

    public Fatura(int idFatura, double valor, String dataVencimento, String dataPagamento, String formaPg, String status, Aluno aluno, Funcionario secretaria) {
        this.idFatura = idFatura;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.formaPg = formaPg;
        this.status = status;
        this.aluno = aluno;
        this.secretaria = secretaria;
    }

    public int getIdFatura() {
        return idFatura;
    }

    public void setIdFatura(int idFatura) {
        this.idFatura = idFatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getFormaPg() {
        return formaPg;
    }

    public void setFormaPg(String formaPg) {
        this.formaPg = formaPg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Funcionario secretaria) {
        this.secretaria = secretaria;
    }
    
    
}
