package exercicio7.main;

import exercicio7.Funcionario;
import exercicio7.Gerente;
import exercicio7.Supervisor;
import exercicio7.Vendedor;

public class Main {
    public static void main(String[] args) {

        Funcionario g = new Gerente("Cleber",48,12000.00d);

        Funcionario s = new Supervisor("Joaquim",32,8000.00d);

        Funcionario v = new Vendedor("Lucio",25,5000.00d);

        System.out.println(g.toString() + " | Bonificação de Gerente: " + g.bonificacao());
        System.out.println(s.toString() + " | Bonificação de Supervisor: " + s.bonificacao());
        System.out.println(v.toString() + " | Bonificação de Vendedor: " + v.bonificacao());

    }
}
