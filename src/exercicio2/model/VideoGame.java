package exercicio2.model;

import exercicio2.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    @Override
    public double calculaImposto() {
        if (this.isUsado) {
            System.out.println("Imposto Video-Game Usado:");
            return this.getPreco() * 1.25 - this.getPreco();
        } else {
            System.out.println("Imposto Video-Game Novo");
            return this.getPreco() * 1.45 - this.getPreco();
        }
    }

    public String getMarca() { return marca; }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }
}
