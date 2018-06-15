package model;

public class AvaliacaoFisica {

    private double gluteos;
    private String status;
    private String dataAvaliacao;
    private String dataVencimentoAvaliacao;
    private double coxa;
    private double altura;
    private double braco;
    private double gorduraCorporal;
    private double frequenciaCardiaca;
    private double abdomem;
    private double peso;
    private double panturrilha;
    private double torax;
    private double peito;
    private double triceps;
    private double supraIliada;
    private double subEscapular;
    private Funcionario funcionario;
    private Aluno aluno;

    public AvaliacaoFisica(double gluteos, String status, String dataAvaliacao, String dataVencimentoAvaliacao, double coxa, double altura, double braco, double gorduraCorporal, double frequenciaCardiaca, double abdomem, double peso, double panturrilha, double torax, double peito, double triceps, double supraIliada, double subEscapular, Funcionario funcionario, Aluno aluno) {
        this.gluteos = gluteos;
        this.status = status;
        this.dataAvaliacao = dataAvaliacao;
        this.dataVencimentoAvaliacao = dataVencimentoAvaliacao;
        this.coxa = coxa;
        this.altura = altura;
        this.braco = braco;
        this.gorduraCorporal = gorduraCorporal;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.abdomem = abdomem;
        this.peso = peso;
        this.panturrilha = panturrilha;
        this.torax = torax;
        this.peito = peito;
        this.triceps = triceps;
        this.supraIliada = supraIliada;
        this.subEscapular = subEscapular;
        this.funcionario = funcionario;
        this.aluno = aluno;
    }

    public AvaliacaoFisica() {
    }

    public double getGluteos() {
        return gluteos;
    }

    public void setGluteos(double gluteos) {
        this.gluteos = gluteos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getDataVencimentoAvaliacao() {
        return dataVencimentoAvaliacao;
    }

    public void setDataVencimentoAvaliacao(String dataVencimentoAvaliacao) {
        this.dataVencimentoAvaliacao = dataVencimentoAvaliacao;
    }

    public double getCoxa() {
        return coxa;
    }

    public void setCoxa(double coxa) {
        this.coxa = coxa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBraco() {
        return braco;
    }

    public void setBraco(double braco) {
        this.braco = braco;
    }

    public double getGorduraCorporal() {
        return gorduraCorporal;
    }

    public void setGorduraCorporal(double gorduraCorporal) {
        this.gorduraCorporal = gorduraCorporal;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public double getAbdomem() {
        return abdomem;
    }

    public void setAbdomem(double abdomem) {
        this.abdomem = abdomem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(double panturrilha) {
        this.panturrilha = panturrilha;
    }

    public double getTorax() {
        return torax;
    }

    public void setTorax(double torax) {
        this.torax = torax;
    }

    public double getPeito() {
        return peito;
    }

    public void setPeito(double peito) {
        this.peito = peito;
    }

    public double getTriceps() {
        return triceps;
    }

    public void setTriceps(double triceps) {
        this.triceps = triceps;
    }

    public double getSupraIliada() {
        return supraIliada;
    }

    public void setSupraIliada(double supraIliada) {
        this.supraIliada = supraIliada;
    }

    public double getSubEscapular() {
        return subEscapular;
    }

    public void setSubEscapular(double subEscapular) {
        this.subEscapular = subEscapular;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    //Metodos 
    //Calculo o IMC 
    public double imc(double peso, double altura) {
        return ((peso) / (altura * altura));
    }

    //Calcula o volume max de oxigênio de acordo com o sexo
    public double volumeMaxOxigenio(String sexo, double frequenciaCardiaca) {
        if (sexo == "masculino") {
            return (111.33 - (0.42 * frequenciaCardiaca));
        } else {
            return (65.81 - (0.1847 * frequenciaCardiaca));
        }
    }

    // calcula o percentualGordura
    public double percentualGordura(double peito, double triceps, double supraIliaca, double subEscapular, double abdominal, double coxa) {

        return ((peito + triceps + supraIliaca + subEscapular + abdominal + coxa) * (6.735));

    }

    //Calcula o peso gordo
    public double pesoGordo(double pesoAtual, double peito, double triceps, double supraIliaca, double subEscapular, double abdominal, double coxa) {

        return ((percentualGordura(peito, triceps, supraIliaca, subEscapular, abdominal, coxa) / 100) * pesoAtual);

    }

    //calcula o o peso do musculo, sem a gordura
    public double pesomagro(double pesoAtual, double peito, double triceps, double supraIliaca, double subEscapular, double abdominal, double coxa) {

        return (pesoGordo(pesoAtual, peito, triceps, supraIliaca, subEscapular, abdominal, coxa) - pesoAtual);

    }

    public double pesoResidual(double pesoAtual, String sexo) {
        if (sexo == "masculino") {
            return pesoAtual * 0.24;
        } else {
            return pesoAtual * 0.21;
        }
    }

}
