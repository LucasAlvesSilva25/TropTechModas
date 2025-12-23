package Model;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;

    public String completo() {
        return rua + ", " + numero + ", " + cidade + " - " + estado + ", " + pais;
    }

}
