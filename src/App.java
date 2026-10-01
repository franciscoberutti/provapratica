import java.util.Scanner;

public class App {

    public void criarVetSala() {
        Sala sala1 = new Sala(0, null, 0, null, null);
        Sala sala2 = new Sala(0, null, 0, null, null);
        Sala sala3 = new Sala(0, null, 0, null, null);
    
        Veterinario vet1 = new Veterinario(null, null, null, null);
        Veterinario vet2 = new Veterinario(null, null, null, null);
        Veterinario vet3 = new Veterinario(null, null, null, null);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção: \r\n" + // 
                        "1. Cadastrar atendimento\r\n" + //
                        "2. Associar um veterinário a uma sala\r\n" + //
                        "3. Atribuir atendimento a uma sala\r\n" + //
                        "4. Exibir todos os atendimentos atribuídos a uma sala específica e o total de atendimentos\r\n" + //
                        "5. Quantidade total de atendimentos finalizados por cada sala\r\n" + //
                        "6. Buscar atendimentos por status. \r\n" + //
                        "7. Exibir os detalhes completos de um atendimento específico");
    }
};   
