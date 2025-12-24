package Model;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numero, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    private String pais;

    public String completo() {
        return rua + ", " + numero + ", " + cidade + " - " + estado + ", " + pais;
    }

}
