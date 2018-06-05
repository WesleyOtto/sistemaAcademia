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
public enum Cargo {
    ADMINISTRADOR(1), ALUNO(2), INSTRUTOR(3), SECRETARIA(4);

    private int cargo;

    private Cargo(int cargo) {
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    
}
