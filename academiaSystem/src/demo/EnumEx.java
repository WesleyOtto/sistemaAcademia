/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import model.Cargo; 

/**
 *
 * @author wesle
 */
public class EnumEx {
    public static void main(String[] args) {
        System.out.println("CARGO: " + Cargo.ADMINISTRADOR);
        
        System.out.println("CARGO: " + Cargo.ADMINISTRADOR.getCargo());
        
        Funcionario f = new Funcionario();
        f.setCargo(Cargo.values()[2]);
        
        System.out.println("CARGO: " + f.getCargo().getCargo());
    }
    
}
