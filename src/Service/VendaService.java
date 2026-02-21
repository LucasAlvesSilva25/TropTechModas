package Service;

import Model.Venda;
import Repository.VendasRepository;

import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private VendasRepository vendasRepository;
    private ClienteService clienteService;

    public VendaService(VendasRepository VendasRepository, ClienteService ClientService) {
        this.vendasRepository = VendasRepository;
        this.clienteService = ClientService;
    }

    public String cadastrarVenda(String descricao, double valorTotal, String tipo, String documento) {


        // tratar o erro de quando não tem cliente, não efetuar o cadastro da venda

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
