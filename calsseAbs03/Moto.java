package calsseAbs03;

public class Moto extends Veiculo{
    private String guidao;

    Moto(String guidao, String marca, String modelo, double capacidadeTanque, double consumoLitro){
        super(marca, modelo, capacidadeTanque, consumoLitro);
        this.guidao = guidao;
    }
    
    public String getGuidao() {
        return guidao;
    }
    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    @Override
    public double calcularAutonomia(){
        return capacidadeTanque * consumoLitro;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nCapacidade Tanque: " + capacidadeTanque + "\nConsumo por litro: " + consumoLitro + "\nTipo de guidão: " + guidao);
    }
}
