import java.util.ArrayList;

interface Trabalhavel {
    void trabalhar();

    void relatar();
}

abstract class Funcionario implements Trabalhavel {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcSalario();

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}

class Gerente extends Funcionario {
    private double bonus;
    private String equipe;

    public Gerente(String nome, String matricula, double bonus, String equipe) {
        super(nome, matricula);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    @Override
    public double calcSalario() {
        return 5000 + bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando com sua equipe: " + equipe);
    }

    @Override
    public void relatar() {
        System.out.println("Gerente relatando progresso da equipe: " + equipe);
    }
}

class Desenvolvedor extends Funcionario {
    private ArrayList<String> linguagens;

    public Desenvolvedor(String nome, String matricula, ArrayList<String> linguagens) {
        super(nome, matricula);
        this.linguagens = linguagens;
    }

    @Override
    public double calcSalario() {
        return 3000 + linguagens.size() * 500;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor trabalhando...");
    }

    @Override
    public void relatar() {
        System.out.println("Desenvolvedor relatando progresso...");
    }
}

class Estagiario extends Funcionario {
    private int horas;
    private String supervisor;

    public Estagiario(String nome, String matricula, int horas, String supervisor) {
        super(nome, matricula);
        this.horas = horas;
        this.supervisor = supervisor;
    }

    @Override
    public double calcSalario() {
        return horas * 10;
    }

    @Override
    public void trabalhar() {
        System.out.println("Estagiario trabalhando sob supervisão de " + supervisor);
    }

    @Override
    public void relatar() {
        System.out.println("Estagiario relatando progresso...");
    }
}
