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
public class PlanoTreino {

    private int codPlano;
    private int series;
    private int repeticoes;
    private int tempoDescanso;
    private String observacao;
    private String diaSemana;
    private Treino treino;
    private Exercicio exercicio;

    public PlanoTreino(int codPlano, int series, int repeticoes, int tempoDescanso, String observacao, String diaSemana, Treino treino, Exercicio exercicio) {
        this.codPlano = codPlano;
        this.series = series;
        this.repeticoes = repeticoes;
        this.tempoDescanso = tempoDescanso;
        this.observacao = observacao;
        this.diaSemana = diaSemana;
        this.treino = treino;
        this.exercicio = exercicio;
    }

    public int getCodPlano() {
        return codPlano;
    }

    public void setCodPlano(int codPlano) {
        this.codPlano = codPlano;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanso(int tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }
    

}
