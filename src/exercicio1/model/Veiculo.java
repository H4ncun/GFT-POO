package exercicio1.model;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String cor, float km, int litrosCombustivel, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = false;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = 0;
        this.preco = preco;
    }

    public void acelerar() {
        setVelocidade(getVelocidade() + 20);
    }

    public void abastecer(int combustivel) {
        int comb = this.getLitrosCombustivel() + combustivel;
        if (comb < 60) {
            setLitrosCombustivel(comb);
            System.out.println("Carro abastecido");
        } else {
            int sobra = comb - 60;
            setLitrosCombustivel(60);
            System.out.println("Seu tanque está cheio e sobrou " + sobra + " Litros");
        }
    }

    public void freiar() {
        int velocidade = this.getVelocidade();
        if (velocidade > 0) {
            setVelocidade(velocidade - 20);
        }else {
            System.out.println("Carro parado");
        }
    }

    public void pintar(String cor) {
        setCor(cor);
    }

    public void ligar() {
        if (!this.isLigado) {
            this.isLigado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro já está ligado");
        }
    }

    public void desligar() {
        if (velocidade == 0) {
            if (this.isLigado) {
                this.isLigado = false;
                System.out.println("Carro Desligado");
            } else {
                System.out.println("Carro já está desligado");
            }
        } else {
            System.out.println("Carro precisa estar parado para desligar");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
