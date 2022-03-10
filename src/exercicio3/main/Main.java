package exercicio3.main;

import exercicio3.model.Guerreiro;
import exercicio3.model.Mago;
import exercicio3.model.Personagem;

public class Main {
    public static void main(String[] args) {

        Mago m1 = new Mago("Merlin",250,250,100,20,15,1);
        Mago m2 = new Mago("Habra Kdbra",350,200,100,25,10,1);
        Mago m3 = new Mago("Gndalf",500,350,100,50,15,3);
        Guerreiro g1 = new Guerreiro("Conan",400,100,100,10,40,1);
        Guerreiro g2 = new Guerreiro("Brutus",850,200,100,20,100,3);

        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        m1.aprenderMagia("Transformação");
        m1.aprenderMagia("Raio Mortal");
        m2.aprenderMagia("Bola de Fogo");
        m2.aprenderMagia("Ressureição");
        m3.aprenderMagia("Ressureição");
        m3.aprenderMagia("Controle da Natureza");
        m3.aprenderMagia("Esfera do poder");
        g1.aprenderHabilidade("Super-Força");
        g1.aprenderHabilidade("Resistencia a Veneno");
        g2.aprenderHabilidade("Super Soco");
        g2.aprenderHabilidade("Mega Pulo");
        g2.aprenderHabilidade("Espada Mortal");
        m1.lvlUp();
        g1.lvlUp();
        System.out.println(m1.toString());
        System.out.println(g1.toString());
        m1.attack();
        g1.attack();
        m2.attack();
        m3.attack();
        g2.attack();
        System.out.println("Total de personagens: " + Personagem.personagens);
    }
}
