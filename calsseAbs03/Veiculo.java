package calsseAbs03;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected double capacidadeTanque;
    protected double consumoLitro;
    protected abstract double calcularAutonomia();
    protected abstract void exibirDetalhes();

    Veiculo(String marca, String modelo, double capacidadeTanque, double consumoLitro){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoLitro = consumoLitro;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setConsumoLitro(double consumoLitro) {
        this.consumoLitro = consumoLitro;
    }

    public double getConsumoLitro() {
        return consumoLitro;
    }

    
}