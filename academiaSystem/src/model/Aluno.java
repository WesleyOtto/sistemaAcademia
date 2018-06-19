package model;

public class Aluno extends Usuario {

    private int matriculaAluno;
    private String dataMatricula;
    private String status;
    private String profissao;
    private Funcionario funcionario;
    private AvaliacaoFisica avaliacaoFisica;
    private Treino treino;
    private Fatura fatura;

    public Aluno(int matriculaAluno, String dataMatricula, String status, String profissao, Funcionario funcionario, AvaliacaoFisica avaliacaoFisica, Treino treino, Fatura fatura, int idUsuario, String CPF, String RG, String nome, String telefone, String celular, String email, char sexo, int nivelAcesso, String dataNascimento, String estadoCivil, String foto) {
        super(idUsuario, CPF, RG, nome, telefone, celular, email, sexo, nivelAcesso, dataNascimento, estadoCivil, foto);
        this.matriculaAluno = matriculaAluno;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.profissao = profissao;
        this.funcionario = funcionario;
        this.avaliacaoFisica = avaliacaoFisica;
        this.treino = treino;
        this.fatura = fatura;
    }

    public Aluno(int matriculaAluno, String dataMatricula, String status, String profissao, Funcionario funcionario, AvaliacaoFisica avaliacaoFisica, Treino treino, Fatura fatura) {
        this.matriculaAluno = matriculaAluno;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.profissao = profissao;
        this.funcionario = funcionario;
        this.avaliacaoFisica = avaliacaoFisica;
        this.treino = treino;
        this.fatura = fatura;
    }

    public Aluno() {
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public AvaliacaoFisica getAvaliacaoFisica() {
        return avaliacaoFisica;
    }

    public void setAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica) {
        this.avaliacaoFisica = avaliacaoFisica;
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

}
