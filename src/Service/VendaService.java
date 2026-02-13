package Service;

import Model.Venda;
import Repository.VendasRepository;

import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private VendasRepository vendasRepository;

    public VendaService() {
        this.vendasRepository = new VendasRepository();
    }

    public String cadastrarVenda(String descricao, double valorTotal, String tipo, String documento) {

        //validar se o cliente existe
        ClienteService clienteService = new ClienteService();
        Venda venda = new Venda(descricao, valorTotal, clienteService.buscarPorDocumento(tipo, documento));
        vendasRepository.adicionar(venda);

        return "Venda cadastrada com sucesso!";

    }

    public List<String> listarTodasVendas() {
        List<String> resultado = new ArrayList<>();

        for (Venda venda : vendasRepository.listarTodasVendas()) {
            String linha = String.format(venda.toString());
            resultado.add(linha);
        }

        return resultado;

    }
}
