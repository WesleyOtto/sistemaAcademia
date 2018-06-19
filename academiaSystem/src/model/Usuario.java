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
public class Usuario {

    private int idUsuario;
    private String CPF;
    private String RG;
    private String nome;
    private String telefone;
    private String celular;
    private String email;
    private char sexo;
    private int nivelAcesso;
    private String dataNascimento;
    private String estadoCivil;
    private String foto; //Nao sei como colocar foto procurar!!!

    public Usuario(int idUsuario, String CPF, String RG, String nome, String telefone, String celular, String email, char sexo, int nivelAcesso, String dataNascimento, String estadoCivil, String foto) {
        this.idUsuario = idUsuario;
        this.CPF = CPF;
        this.RG = RG;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.sexo = sexo;
        this.nivelAcesso = nivelAcesso;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.foto = foto;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

}
