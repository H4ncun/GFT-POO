package exercicio3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

    private List<String> magia = new ArrayList<>();

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    @Override
    public void lvlUp() {
        this.setMana(this.getMana() + 50);
        this.setInteligencia(this.getInteligencia() + 50);
        this.setForca(this.getForca() + 10);
        this.setVida(this.getVida() + 20);
        this.setLevel((this.getLevel() + 1));
        System.out.println(getNome() + " Level UP! \n" + "Level: " + this.getLevel());
    }

    public void attack() {
        Random random = new Random();
        int numeroRandomico = random.nextInt(300);
        int atk = (this.getInteligencia() * this.getLevel()) + numeroRandomico;
        System.out.println("O Ataque de " + getNome() + " deu: " + atk + " de dano");
    }

    public void aprenderMagia(String magias) {
        magia.add(magias);
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return "Mago:" + super.toString() + " Magias:" + getMagia();
    }
}
