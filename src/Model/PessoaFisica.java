package Model;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String telefone, Endereco endereco, String CPF) {
        super(nome, telefone, endereco);
        this.cpf = CPF;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }
    public String getCPF() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | CPF: %s ", cpf);
    }

}
