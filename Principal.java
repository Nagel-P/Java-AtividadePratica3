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
                    adicionarFuncionario(funcionarios);
                    break;
                case 2:
                    removerFuncionario(funcionarios);
                    break;
                case 3:
                    exibirFuncionarios(funcionarios);
                    break;
                case 4:
                    buscarFuncionario(funcionarios);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
