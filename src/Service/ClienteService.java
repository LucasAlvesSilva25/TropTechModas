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
    }

    public void cadastrarCliente(){

    }

    public Endereco cadastrarEndereco(String rua, String numero, String cidade, String estado, String pais){
        return new Endereco(rua, numero, cidade, estado, pais);
    }

//    private String cadastrarPessoaFisica(String nome, String telefone, ) {
//
//        if (pessoaFisicaRepo.buscarPorCpf(cpf) != null) {
//            throw new IllegalArgumentException("CPF já cadastrado");
//        }
//
//        PessoaFisica pf = new PessoaFisica(null, nome, cpf, email, telefone);
//        pessoaFisicaRepo.adicionar(pf);
//        return "Pessoa Física cadastrada com sucesso!";
//    }
//
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
