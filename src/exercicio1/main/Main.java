package exercicio1.main;

import exercicio1.model.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo v = new Veiculo("Ford", "Fiesta","FYH-8765","BRANCO",1000f,37,40000d);

        v.ligar();
        v.acelerar();
        v.acelerar();
        System.out.println("Velocidade do carro: " + v.getVelocidade());
        v.freiar();
        System.out.println("Velocidade do carro: " + v.getVelocidade());
        v.desligar();
        v.freiar();
        v.desligar();
        v.abastecer(5);
        System.out.println(v.getLitrosCombustivel());
        v.abastecer(25);
        System.out.println(v.getLitrosCombustivel());
        System.out.println(v.getCor());
        v.pintar("ROSA");
        System.out.println(v.getCor());
    }
}
