import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Exibir Todos os Funcionários");
            System.out.println("4. Buscar Funcionário por Nome ou Matrícula");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Console.lerInt();

            switch (opcao) {
                case 1:
                    addFunc(funcionarios);
                    break;
                case 2:
                    removeFunc(funcionarios);
                    break;
                case 3:
                    exibirFunc(funcionarios);
                    break;
                case 4:
                    buscarFunc(funcionarios);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void addFunc(ArrayList<Funcionario> funcionarios) {

    }

    private static void removeFunc(ArrayList<Funcionario> funcionarios) {
        
    }

    private static void exibirFunc(ArrayList<Funcionario> funcionarios) {
        
    }

    private static void buscarFunc(ArrayList<Funcionario> funcionarios) {
        
        }
    }
