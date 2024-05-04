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
    
}

class Desenvolvedor extends Funcionario {
    
}

class Estagiario extends Funcionario {
    
}
