package calsseAbs03;

public class Carro extends Veiculo{
    private int numPortas;

    Carro(int numPortas, String marca, String modelo, double capacidadeTanque, double consumoLitro){
        super(marca, modelo, capacidadeTanque, consumoLitro);
        this.numPortas = numPortas;
    }

    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    public int getNumPortas(){
        return numPortas;
    }

    @Override
    public double calcularAutonomia(){
        return capacidadeTanque * consumoLitro;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nCapacidade Tanque: " + capacidadeTanque + "\nConsumo por litro: " + consumoLitro + "\nNúmero de portas: " + numPortas);
    }
    
}
