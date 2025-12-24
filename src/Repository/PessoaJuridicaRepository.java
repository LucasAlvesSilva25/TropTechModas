package Repository;

import Model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaRepository {

    List<PessoaJuridica> listaPessoaJusridica;

    public PessoaJuridicaRepository() {
        listaPessoaJusridica = new ArrayList<>();
    }

    public void adicionar(PessoaJuridica pessoaJuridica) {
        listaPessoaJusridica.add(pessoaJuridica);
    }

    public List<PessoaJuridica> listarTodos() {
        return new ArrayList<>(listaPessoaJusridica);
    }

    public List<PessoaJuridica> buscarPorNome(String nome) {
        List<PessoaJuridica> resultado = new ArrayList<>();
        if (nome == null || nome.trim().isEmpty()) {
            return resultado;
        }

        String nomeBuscar = nome.toLowerCase();
        for (PessoaJuridica pessoa : listaPessoaJusridica) {
            if (pessoa.getNome().toLowerCase().contains(nomeBuscar)) {
                resultado.add(pessoa);
            }
        }
        return resultado;
    }

    public PessoaJuridica buscarPorCnpj(String cnpj) {
        if (cnpj == null || cnpj.trim().isEmpty()) {
            return null;
        }
        for (PessoaJuridica pessoa : listaPessoaJusridica) {
            if (cnpj.equals(pessoa.getCNPJ())) {
                return pessoa;
            }
        }
        return null;
    }

    public boolean atualizar(PessoaJuridica pessoaAtualizada) {
        if (pessoaAtualizada.getNome() == null || pessoaAtualizada.getCNPJ() == null) {
            return false;
        }

        for (int i = 0; i < listaPessoaJusridica.size(); i++) {
            PessoaJuridica pessoa = listaPessoaJusridica.get(i);
            if (pessoa.getCNPJ().equals(pessoaAtualizada.getCNPJ())) {
                listaPessoaJusridica.set(i, pessoaAtualizada);
                return true;
            }
        }
        return false;
    }

    public boolean removerPorCnpj(String cnpj) {
        PessoaJuridica pessoaParaRemover = buscarPorCnpj(cnpj);
        if (pessoaParaRemover != null) {
            listaPessoaJusridica.remove(pessoaParaRemover);
            return true;
        }
        return false;
    }

}
