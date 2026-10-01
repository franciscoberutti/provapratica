import java.util.ArrayList;

public class Sala {
    private int numero;
    private String bloco;
    private int maxCapacidade;
    private String tipoSala;
    private Veterinario vetResponsavel;
    private ArrayList<Atendimento> atendimentos;
    
    public Sala(int numero, String bloco, int maxCapacidade, String tipoSala, Veterinario vetResponsavel) {
        this.numero = numero;
        this.bloco = bloco;
        this.maxCapacidade = maxCapacidade;
        this.tipoSala = tipoSala;
        this.vetResponsavel = vetResponsavel;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBloco() {
        return bloco;
    }
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
    public int getMaxCapacidade() {
        return maxCapacidade;
    }
    public void setMaxCapacidade(int maxCapacidade) {
        this.maxCapacidade = maxCapacidade;
    }
    public String getTipoSala() {
        return tipoSala;
    }
    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }
    public Veterinario getVetResponsavel() {
        return vetResponsavel;
    }
    public void setVetResponsavel(Veterinario vetResponsavel) {
        this.vetResponsavel = vetResponsavel;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
    
    public void associarVeterinario (Sala sala, Veterinario vetResponsavel) {
        sala.setVetResponsavel(vetResponsavel);
    }

    public void atribuirAtendimento (Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public void mostrarAtendimentos (Sala sala) {
        for (int i=0; i < sala.getAtendimentos().size(); i++) {
            System.out.print(sala.getAtendimentos().get(i).getCodigo());
        }
        System.out.print(sala.getAtendimentos().size());
    }

    public void atendimentosFinalizados (Sala sala) {
        for (int i=0; i < sala.getAtendimentos().size(); i++) {
            int atendimentosFinalizados = 0;
            if (sala.getAtendimentos().get(i).getStatusAtendimento() == "Finalizado" ) {
                atendimentosFinalizados += 1;
            }
            System.out.print(atendimentosFinalizados);
        }
    }
}
