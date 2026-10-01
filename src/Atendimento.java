
public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String hora;
    private String statusAtendimento;
    private String observacoes;
    private Procedimento procedimento;
    private Sala sala;
    private Veterinario veterinario;
    
    
        public Atendimento(String codigo, String nomeAnimal, String especie, String nomeTutor, String data, String hora,
                String statusAtendimento, String observacoes, Procedimento procedimento) {
            this.codigo = codigo;
            this.nomeAnimal = nomeAnimal;
            this.especie = especie;
            this.nomeTutor = nomeTutor;
            this.data = data;
            this.hora = hora;
            this.statusAtendimento = statusAtendimento;
            this.observacoes = observacoes;
            this.procedimento = procedimento;
        }
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getNomeTutor() {
        return nomeTutor;
    }
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getStatusAtendimento() {
        return statusAtendimento;
    }
    public void setStatusAtendimento(String statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    


    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public void cadastrarAtendimento (Atendimento atendimento) {
        atendimento = new Atendimento(codigo, nomeAnimal, especie, nomeTutor, data, hora, statusAtendimento, observacoes, procedimento);
    }

    public void detalhesAtendimento (Atendimento atendimento) {
        System.out.print(atendimento.getCodigo());
        System.out.print(atendimento.getNomeAnimal());
        System.out.print(atendimento.getEspecie());
        System.out.print(atendimento.getNomeTutor());
        System.out.print(atendimento.getData());
        System.out.print(atendimento.getHora());
        System.out.print(atendimento.getStatusAtendimento());
        System.out.print(atendimento.getObservacoes());
    }
    
    public void buscarPorStatus () {
        
    }
}