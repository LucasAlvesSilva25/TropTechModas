package Service;

import Model.Endereco;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Repository.PessoaFisicaRepository;
import Repository.PessoaJuridicaRepository;

public class ClienteService {

    private PessoaFisicaRepository pessoaFisicaRepo;
    private PessoaJuridicaRepository pessoaJuridicaRepo;

    public ClienteService() {
        this.pessoaFisicaRepo = new PessoaFisicaRepository();
        this.pessoaJuridicaRepo = new PessoaJuridicaRepository();

        // preciso verificar se vai ser necessário isso
    }

    public Endereco cadastrarEndereco(String rua, String numero, String cidade, String estado, String pais) {
        return new Endereco(rua, numero, cidade, estado, pais);
    }


    public String cadastrarCliente(String tipo, String nome, String telefone, String documento, String rua, String numero, String cidade, String estado, String pais) {

        Endereco endereco = cadastrarEndereco(rua, numero, cidade, estado, pais);

        if ("PF".equalsIgnoreCase(tipo)) {

            return cadastrarPessoaFisica(nome, telefone, endereco, documento);

        } else if ("PJ".equalsIgnoreCase(tipo)) {
            return cadastrarPessoaJuridica(nome, telefone, endereco, documento);
        }

        return null;
    }

    private String cadastrarPessoaFisica(String nome, String telefone,
                                         Endereco endereco, String cpf) {

        if (pessoaFisicaRepo.buscarPorCpf(cpf) != null) {
            throw new IllegalArgumentException("CPF já cadastrado");
            // Só vou conseguir testar quando o projeto tiver rodando certinho
        }

        PessoaFisica pf = new PessoaFisica(nome, telefone, endereco, cpf);
        pessoaFisicaRepo.adicionar(pf);
        return "Pessoa Física cadastrada com sucesso!";
    }

    private String cadastrarPessoaJuridica(String nome, String telefone,
                                           Endereco endereco, String cnpj) {

        if (pessoaJuridicaRepo.buscarPorCnpj(cnpj) != null) {
            throw new IllegalArgumentException("CNPJ já cadastrado");
            // Só vou conseguir testar quando o projeto tiver rodando certinho
        }

        PessoaJuridica pj = new PessoaJuridica(nome, telefone, endereco, cnpj);
        pessoaJuridicaRepo.adicionar(pj);
        return "Pessoa Jurídica cadastrada com sucesso!";
    }



}
