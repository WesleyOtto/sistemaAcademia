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
public class Treino {
    
    private int codTreino;
    private String descricaoTreino;
    private String tipoTreino;
    private String objetivo;
    private Funcionario instrutor;
    private Aluno aluno;

    public Treino(int codTreino, String descricaoTreino, String tipoTreino, String objetivo, Funcionario instrutor, Aluno aluno) {
        this.codTreino = codTreino;
        this.descricaoTreino = descricaoTreino;
        this.tipoTreino = tipoTreino;
        this.objetivo = objetivo;
        this.instrutor = instrutor;
        this.aluno = aluno;
    }

    public int getCodTreino() {
        return codTreino;
    }

    public void setCodTreino(int codTreino) {
        this.codTreino = codTreino;
    }

    public String getDescricaoTreino() {
        return descricaoTreino;
    }

    public void setDescricaoTreino(String descricaoTreino) {
        this.descricaoTreino = descricaoTreino;
    }

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Funcionario getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Funcionario instrutor) {
        this.instrutor = instrutor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
