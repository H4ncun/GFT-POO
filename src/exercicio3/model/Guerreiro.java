package exercicio3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

    private List<String> habilidade = new ArrayList<>();

    @Override
    public void lvlUp() {
        this.setMana(this.getMana() + 10);
        this.setInteligencia(this.getInteligencia() + 20);
        this.setForca(this.getForca() + 50);
        this.setVida(this.getVida() + 100);
        this.setLevel((this.getLevel() + 1 ));
        System.out.println(getNome() + " Level UP! \n" + "Level: " + this.getLevel());
    }

    public void attack(){
        Random random = new Random();
        int numeroRandomico = random.nextInt(300);
        int atk = (this.getForca() * this.getLevel()) + numeroRandomico;
        System.out.println("O Ataque de " + getNome() + " deu: " + atk + " de dano");
    }

    public void aprenderHabilidade(String habilidades){
        habilidade.add(habilidades);
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    @Override
    public String toString() {
        return "Guerreiro:" + super.toString() + " Habilidades:" + getHabilidade();
    }
}
