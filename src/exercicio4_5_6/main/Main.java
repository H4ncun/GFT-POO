package exercicio4_5_6.main;

import exercicio4_5_6.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jessica", 18);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        imprimeMaisVelho(pessoas);

        System.out.println(pessoas.toString());
        removeMenores(pessoas);
        System.out.println(pessoas.toString());

        pesquisa(pessoas, "Jessica");

    }


    public static void imprimeMaisVelho(List<Pessoa> pessoas) {
        String nomeMaisVelho = "";
        int maisVelho = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > maisVelho) {
                maisVelho = pessoa.getIdade();
                nomeMaisVelho = pessoa.getNome();
            }
        }
        System.out.println("Pessoa Mais velha:" + nomeMaisVelho);
    }

    public static void pesquisa(List<Pessoa> pessoas, String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                System.out.println("Ela existe!");
                System.out.println(pessoa.getIdade());
            }
        }
    }

    public static void removeMenores(List<Pessoa> pessoas) {
        pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);
    }
}
