package r8;

import java.time.LocalDate;
public class Pedido {
    private String id;
    private LocalDate data;
    private double valor;
    public Pedido(String id, LocalDate data, double valor) {
        this.id = id;
        this.data = data;
        this.valor = valor;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
