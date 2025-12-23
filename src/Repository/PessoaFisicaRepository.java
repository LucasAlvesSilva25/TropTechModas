package Repository;

import Model.PessoaFisica;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaRepository {

    List<PessoaFisica> listaPessoaFisica;

    public PessoaFisicaRepository() {
        listaPessoaFisica = new ArrayList<>();
    }

    public void adicionar(PessoaFisica pessoaFisica) {
        listaPessoaFisica.add(pessoaFisica);
    }

    public List<PessoaFisica> listarTodos() {
        return new ArrayList<>(listaPessoaFisica);
    }

    public List<PessoaFisica> buscarPorNome(String nome) {
        List<PessoaFisica> resultado = new ArrayList<>();
        if (nome == null || nome.trim().isEmpty()) {
            return resultado;
        }

        String nomeBusca = nome.toLowerCase();
        for (PessoaFisica pessoa : listaPessoaFisica) {
            if (pessoa.getNome().toLowerCase().contains(nomeBusca)) {
                resultado.add(pessoa);
            }
        }
        return resultado;
    }

    public PessoaFisica buscarPorCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            return null;
        }

        for (PessoaFisica pessoa : listaPessoaFisica) {
            if (cpf.equals(pessoa.getCPF())) {
                return pessoa;
            }
        }
        return null;
    }

    public boolean atualizar(PessoaFisica pessoaAtualizada) {
        if (pessoaAtualizada == null || pessoaAtualizada.getCPF() == null) {
            return false;
        }

        for (int i = 0; i < listaPessoaFisica.size(); i++) {
            PessoaFisica pessoa = listaPessoaFisica.get(i);
            if (pessoa.getCPF().equals(pessoaAtualizada.getCPF())) {
                listaPessoaFisica.set(i, pessoaAtualizada);
                return true;
            }
        }
        return false;
    }

    public boolean removerPorCpf(String cpf) {
        PessoaFisica pessoaParaRemover = buscarPorCpf(cpf);
        if (pessoaParaRemover != null) {
            listaPessoaFisica.remove(pessoaParaRemover);
            return true;
        }
        return false;
    }


}
