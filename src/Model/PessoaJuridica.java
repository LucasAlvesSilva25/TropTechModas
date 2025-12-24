package Model;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, Endereco endereco, String cnpj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCNPJ() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | CNPJ: %s ", cnpj);
    }
}
