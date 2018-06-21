package model;

public class Acesso {

    private String login;
    private String senha;
    private Usuario usuario;

    public Acesso(String login, String senha, Usuario usuario) {
        this.login = login;
        this.senha = senha;
        this.usuario = usuario;
    }

    public Acesso() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean acessarSistema(String usuario, String senha, String usuarioBD, String senhaBD) {
        return usuario.equals(usuarioBD) && senha.equals(senhaBD);
    }

}
