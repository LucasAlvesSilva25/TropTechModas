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

    public Endereco cadastrarEndereco(String rua, String numero, String cidade, String estado, String pais){
        return new Endereco(rua, numero, cidade, estado, pais);
    }


    public String cadastrarCliente(String tipo, String nome, String telefone,String documento, String rua, String numero, String cidade, String estado, String pais){

        // vou chamar esse metódo na main passando as informações  e ele vai chamar os metodos responsaveis por fazer o cadastro do PF ou PJ

        Endereco endereco = cadastrarEndereco(rua,numero,cidade,estado,pais);

        if ("PF".equalsIgnoreCase(tipo)) {

            return cadastrarPessoaFisica(nome,telefone,endereco,documento);

       }
//        else if ("PJ".equalsIgnoreCase(tipo)) {
//            cliente = new PessoaJuridica(nome, telefone, endereco, documento, email);
//            pessoaJuridicaRepo.adicionar((PessoaJuridica) cliente);
//        }

            return null;
    }

    private String cadastrarPessoaFisica(String nome, String telefone,
                                         Endereco endereco, String cpf) {

        if (pessoaFisicaRepo.buscarPorCpf(cpf) != null) {
            throw new IllegalArgumentException("CPF já cadastrado");
        }

        PessoaFisica pf = new PessoaFisica(nome,telefone,endereco,cpf);
        pessoaFisicaRepo.adicionar(pf);
        return "Pessoa Física cadastrada com sucesso!";
    }

    // Acrescentar a mesma logica do PF e colocar no cadastrar Client
//    private String cadastrarPessoaJuridica(String razaoSocial, String cnpj,
//                                           String email, String telefone) {
//        // Valida CNPJ específico
////        if (!validarFormatoCNPJ(cnpj)) {
////            throw new IllegalArgumentException("CNPJ inválido");
////        }
//
//        // Verifica se CNPJ já existe
//        if (pessoaJuridicaRepo.buscarPorCnpj(cnpj) != null) {
//            throw new IllegalArgumentException("CNPJ já cadastrado");
//        }
//
//        PessoaJuridica pj = new PessoaJuridica(null, razaoSocial, cnpj, email, telefone);
//        pessoaJuridicaRepo.adicionar(pj);
//        return "Pessoa Jurídica cadastrada com sucesso!";
//    }



}
