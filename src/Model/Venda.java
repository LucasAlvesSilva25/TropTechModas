package Model;

public class Venda {
    private String descricao;
    private double valorTotal;
    private Cliente cliente;

    public Venda(String descricao, double valorTotal, Cliente cliente){
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.valorTotal = valorTotal;
    }


}
