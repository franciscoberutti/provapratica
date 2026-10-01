public class Procedimento {
    private String nome;
    private String duracaoEstimada;
    private double valor;
    private String nivelComplexidade;
    
    public Procedimento(String nome, String duracaoEstimada, double valor, String nivelComplexidade) {
        this.nome = nome;
        this.duracaoEstimada = duracaoEstimada;
        this.valor = valor;
        this.nivelComplexidade = nivelComplexidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDuracaoEstimada() {
        return duracaoEstimada;
    }
    public void setDuracaoEstimada(String duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNivelComplexidade() {
        return nivelComplexidade;
    }
    public void setNivelComplexidade(String nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }
    
}
