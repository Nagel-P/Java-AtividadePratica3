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

            int op = Console.lerInt();

            switch (op) {
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
        System.out.println("\nAdicionar Funcionário:");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Matrícula: ");
        String matricula = Console.lerString();
        System.out.print("Tipo (G - Gerente, D - Desenvolvedor, E - Estagiário): ");
        char tipo = Console.lerChar();

        switch (Character.toUpperCase(tipo)) {
            case 'G':
                System.out.print("Bônus Anual: ");
                double bonusAnual = Console.lerFloat();
                System.out.print("Equipe: ");
                String equipe = Console.lerString();
                funcionarios.add(new Gerente(nome, matricula, bonusAnual, equipe));
                break;
            case 'D':
                System.out.print("Quantidade de linguagens de programação dominadas: ");
                int qLinguagens = Console.lerInt();
                ArrayList<String> linguagens = new ArrayList<>();
                for (int i = 0; i < qLinguagens; i++) {
                    System.out.print("Linguagem " + (i + 1) + ": ");
                    linguagens.add(Console.lerString());
                }
                funcionarios.add(new Desenvolvedor(nome, matricula, linguagens));
                break;
            case 'E':
                System.out.print("Horas Trabalhadas: ");
                int horas = Console.lerInt();
                System.out.print("Supervisor: ");
                String supervisor = Console.lerString();
                funcionarios.add(new Estagiario(nome, matricula, horas, supervisor));
                break;
            default:
                System.out.println("Tipo de funcionário inválido!");
        }
        System.out.println("Funcionário adicionado com sucesso!");
    }

    private static void removeFunc(ArrayList<Funcionario> funcionarios) {
        System.out.println("\nRemover Funcionário:");
        System.out.print("Digite o nome ou a matrícula do funcionário: ");
        String termoBusca = Console.lerString();
        boolean removido = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(termoBusca)
                    || funcionario.getMatricula().equalsIgnoreCase(termoBusca)) {
                funcionarios.remove(funcionario);
                removido = true;
                break;
            }
        }
        if (removido) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void exibirFunc(ArrayList<Funcionario> funcionarios) {
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Matrícula: " + funcionario.getMatricula());
        }
    }

    private static void buscarFunc(ArrayList<Funcionario> funcionarios) {
        System.out.println("\nBuscar Funcionário:");
        System.out.print("Digite o nome ou a matrícula do funcionário: ");
        String termoBusca = Console.lerString();
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(termoBusca)
                    || funcionario.getMatricula().equalsIgnoreCase(termoBusca)) {
                System.out.println("Funcionário encontrado:");
                System.out.println("Nome: " + funcionario.getNome() + ", Matrícula: " + funcionario.getMatricula());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
