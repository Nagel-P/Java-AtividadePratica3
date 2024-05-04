import java.util.ArrayList;

interface Trabalhavel {
    void trabalhar();

    void relatar();
}

abstract class Funcionario implements Trabalhavel {
    
}

class Gerente extends Funcionario {
    
}

class Desenvolvedor extends Funcionario {
    
}

class Estagiario extends Funcionario {
    
}
