import java.util.Scanner;

public class SistemaInterno {
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de ingresso:");
        System.out.println("1. Normal");
        System.out.println("2. Camarote Inferior");
        System.out.println("3. Camarote Superior");

        int opcao = scanner.nextInt();
        Ingresso ingresso;

        switch (opcao) {
            case 1: // Normal
                ingresso = new Normal();
                break;
            case 2: // Camarote Inferior
                CamaroteInferior camaroteInferior = new CamaroteInferior();
                System.out.print("Informe a localização do camarote: ");
                scanner.nextLine(); // Consumir a nova linha
                camaroteInferior.setLocalizacao(scanner.nextLine());
                ingresso = camaroteInferior;
                break;
            case 3: // Camarote Superior
                ingresso = new CamaroteSuperior();
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("Detalhes do ingresso selecionado:");
        System.out.println(ingresso);

        scanner.close();
    }
}

