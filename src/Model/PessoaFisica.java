package Model;

public class PessoaFisica extends Cliente{
    private String CPF;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }
}
