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
public class Exercicio {

    private int codExercicio;
    private String grupoMuscular;
    private int carga;
    private String descricaoExercicio;
    private PlanoTreino planoTreino;
    private Funcionario instrutor;

    public Exercicio(int codExercicio, String grupoMuscular, int carga, String descricaoExercicio, PlanoTreino planoTreino, Funcionario instrutor) {
        this.codExercicio = codExercicio;
        this.grupoMuscular = grupoMuscular;
        this.carga = carga;
        this.descricaoExercicio = descricaoExercicio;
        this.planoTreino = planoTreino;
        this.instrutor = instrutor;
    }

    public int getCodExercicio() {
        return codExercicio;
    }

    public void setCodExercicio(int codExercicio) {
        this.codExercicio = codExercicio;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getDescricaoExercicio() {
        return descricaoExercicio;
    }

    public void setDescricaoExercicio(String descricaoExercicio) {
        this.descricaoExercicio = descricaoExercicio;
    }

    public PlanoTreino getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(PlanoTreino planoTreino) {
        this.planoTreino = planoTreino;
    }

    public Funcionario getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Funcionario instrutor) {
        this.instrutor = instrutor;
    }

}
